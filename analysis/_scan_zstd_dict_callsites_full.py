from collections import defaultdict
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB_FULL = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
LIB_FALLBACK = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")

lib_path = LIB_FULL if LIB_FULL.exists() else LIB_FALLBACK
if not lib_path.exists():
    raise SystemExit("libjnimultiengine.so not found")

TARGET_NAMES = [
    "ZSTD_createDDict_advanced",
    "ZSTD_createDDict",
    "ZSTD_DCtx_refDDict",
    "ZSTD_DCtx_loadDictionary",
    "ZSTD_loadDictionary",
    "ZSTD_freeDDict",
]


def sign_extend_26(val):
    if val & (1 << 25):
        val -= 1 << 26
    return val


def collect_dynsym_targets(dynsym):
    found = {}
    extra = {}
    for sym in dynsym.iter_symbols():
        name = sym.name
        if not name:
            continue
        if name in TARGET_NAMES:
            found[name] = sym
        elif name.startswith("ZSTD_") and ("Dict" in name or "DDict" in name or "CDict" in name):
            if name not in found and name not in extra:
                extra[name] = sym
    return found, extra


def sym_defined(sym):
    return sym["st_shndx"] != "SHN_UNDEF" and sym["st_value"] != 0


with lib_path.open("rb") as f:
    elf = ELFFile(f)
    dynsym = elf.get_section_by_name(".dynsym")
    text = elf.get_section_by_name(".text")
    plt = elf.get_section_by_name(".plt") or elf.get_section_by_name(".plt.sec")
    rela = elf.get_section_by_name(".rela.plt") or elf.get_section_by_name(".rela.plt.sec")

    if not text:
        raise SystemExit("no .text section")

    dynsym_found = {}
    dynsym_extra = {}
    if dynsym:
        dynsym_found, dynsym_extra = collect_dynsym_targets(dynsym)

    plt_by_name = {}
    plt0_size = None
    if plt and rela:
        plt_addr = plt["sh_addr"]
        plt_size = plt["sh_size"]
        entry_size = 0x10
        rel_count = rela.num_relocations()
        plt0_size = plt_size - rel_count * entry_size
        dynsym_for_rela = elf.get_section(rela["sh_link"])
        for idx, rel in enumerate(rela.iter_relocations()):
            sym = dynsym_for_rela.get_symbol(rel.entry.r_info_sym)
            name = sym.name
            if name:
                plt_by_name[name] = plt_addr + plt0_size + idx * entry_size

    # Prepare target entries
    target_entries = []
    all_names = list(TARGET_NAMES)
    for name in sorted(dynsym_extra):
        if name not in all_names:
            all_names.append(name)

    for name in all_names:
        sym = dynsym_found.get(name) or dynsym_extra.get(name)
        if sym and sym_defined(sym):
            target_entries.append({"name": name, "addr": sym["st_value"], "kind": "dynsym"})
        elif name in plt_by_name:
            target_entries.append({"name": name, "addr": plt_by_name[name], "kind": "plt"})
        else:
            target_entries.append({"name": name, "addr": None, "kind": "missing"})

    # Scan .text for BL callsites
    text_addr = text["sh_addr"]
    text_data = text.data()
    addr_to_names = defaultdict(list)
    for entry in target_entries:
        if entry["addr"] is not None:
            addr_to_names[entry["addr"]].append(entry["name"])

    callsites = defaultdict(list)
    for off in range(0, len(text_data), 4):
        insn = int.from_bytes(text_data[off : off + 4], "little")
        if (insn & 0xFC000000) == 0x94000000:
            imm26 = insn & 0x03FFFFFF
            target = text_addr + off + (sign_extend_26(imm26) << 2)
            if target in addr_to_names:
                for name in addr_to_names[target]:
                    callsites[name].append(text_addr + off)

# Fallback string scan
blob = lib_path.read_bytes()
string_hits = {}
for name in TARGET_NAMES:
    needle = name.encode("ascii")
    offsets = []
    start = 0
    while True:
        idx = blob.find(needle, start)
        if idx == -1:
            break
        offsets.append(idx)
        start = idx + 1
        if len(offsets) >= 5:
            break
    if offsets:
        string_hits[name] = offsets


lines = []
lines.append("# ZSTD dictionary API callsites (SmartEngines_full)")
lines.append("")
lines.append(f"Target: {lib_path}")
lines.append(f".text: 0x{text_addr:x} size=0x{len(text_data):x}")
lines.append("")

lines.append("## Dynsym/PLT targets")
if not dynsym:
    lines.append("- .dynsym: missing")
else:
    for entry in target_entries:
        name = entry["name"]
        sym = dynsym_found.get(name) or dynsym_extra.get(name)
        if sym and sym_defined(sym):
            lines.append(f"- {name}: dynsym 0x{entry['addr']:x}")
        elif name in plt_by_name:
            lines.append(f"- {name}: PLT 0x{entry['addr']:x}")
        elif sym:
            lines.append(f"- {name}: dynsym undefined (no PLT)")
        else:
            lines.append(f"- {name}: not in dynsym/PLT")
    if dynsym_extra:
        extra_names = ", ".join(sorted(dynsym_extra))
        lines.append("")
        lines.append(f"Extra dynsym ZSTD*Dict symbols: {extra_names}")

if plt and rela and plt0_size is not None:
    lines.append("")
    lines.append(f"PLT0 size: 0x{plt0_size:x} (plt_size=0x{plt['sh_size']:x}, rel_count={rela.num_relocations()})")

lines.append("")
lines.append("## BL callsites in .text")
max_callsites = 20
any_callsites = False
for entry in target_entries:
    name = entry["name"]
    addr = entry["addr"]
    kind = entry["kind"]
    if addr is None:
        lines.append(f"- {name}: no address to scan")
        continue
    calls = sorted(set(callsites.get(name, [])))
    any_callsites = any_callsites or bool(calls)
    lines.append(f"- {name} ({kind} @ 0x{addr:x}): callsites={len(calls)}")
    if calls:
        for c in calls[:max_callsites]:
            lines.append(f"  - 0x{c:x}")
        if len(calls) > max_callsites:
            lines.append(f"  - ... +{len(calls) - max_callsites} more")
    else:
        lines.append("  - (no direct BL in .text)")

lines.append("")
lines.append("## Fallback: string/PLT checks")
if string_hits:
    for name, offsets in string_hits.items():
        off_str = ", ".join(f"0x{off:x}" for off in offsets)
        lines.append(f"- {name}: string hits at {off_str}")
else:
    lines.append("- No ZSTD dictionary symbol strings found in binary")

if plt_by_name:
    dict_plts = {k: v for k, v in plt_by_name.items() if k.startswith("ZSTD_") and ("Dict" in k or "DDict" in k or "CDict" in k)}
    if dict_plts:
        for name, addr in sorted(dict_plts.items()):
            lines.append(f"- PLT entry: {name} @ 0x{addr:x}")
    else:
        lines.append("- No ZSTD*Dict PLT entries")
else:
    lines.append("- No PLT mapping available")

out_path = Path(r"C:\temp\MobileSDK\analysis\zstd_dict_callsites_full.md")
out_path.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(out_path)
