#!/usr/bin/env python3
"""Find functions that reference the RC4 S-box region"""
import struct

SO_PATH = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"
RC4_SBOX = 0x38c92e
CUSTOM_SBOX = 0x38de50

# Load relative offset - assume .text starts around 0x10000
# We need to find ADRP+ADD pairs that reference these addresses

def find_adrp_references(data, target_addr, base_addr=0):
    """Find ADRP instructions that could reference target address"""
    results = []
    target_page = (target_addr >> 12) << 12

    for i in range(0, len(data) - 4, 4):
        instr = struct.unpack('<I', data[i:i+4])[0]

        # ADRP format: 1 | immlo(2) | 10000 | immhi(19) | Rd(5)
        if (instr & 0x9f000000) == 0x90000000:
            rd = instr & 0x1f
            immlo = (instr >> 29) & 0x3
            immhi = (instr >> 5) & 0x7ffff
            imm = (immhi << 2) | immlo
            # Sign extend 21-bit
            if imm & 0x100000:
                imm |= 0xffe00000
            imm = imm << 12

            # PC-relative page
            pc_page = ((i + base_addr) >> 12) << 12
            result_page = (pc_page + imm) & 0xffffffff

            if result_page == target_page:
                results.append((i, rd, result_page))
                if len(results) >= 50:
                    break

    return results

with open(SO_PATH, "rb") as f:
    data = f.read()

print(f"Searching for ADRP references to RC4 S-box page (0x{(RC4_SBOX >> 12) << 12:08x})")
print(f"Target: 0x{RC4_SBOX:08x}, Custom: 0x{CUSTOM_SBOX:08x}\n")

# Find ADRP to target page
refs = find_adrp_references(data, RC4_SBOX)

print(f"Found {len(refs)} ADRP refs to target page:")
for off, rd, page in refs[:20]:
    # Check next instruction for ADD
    if off + 4 < len(data):
        next_instr = struct.unpack('<I', data[off+4:off+8])[0]
        # ADD (immediate): 1 | 0 | 0 | 100010 | sh | imm12 | Rn | Rd
        if (next_instr & 0x7f800000) == 0x11000000:
            imm12 = (next_instr >> 10) & 0xfff
            rn = (next_instr >> 5) & 0x1f
            rd2 = next_instr & 0x1f
            final_addr = page + imm12
            if abs(final_addr - RC4_SBOX) < 0x1000 or abs(final_addr - CUSTOM_SBOX) < 0x1000:
                print(f"  0x{off:08x}: ADRP+ADD -> 0x{final_addr:08x} (target={hex(RC4_SBOX if abs(final_addr - RC4_SBOX) < 0x1000 else CUSTOM_SBOX)})")

print("\n=== Functions near S-box references ===")
# Try to identify function boundaries
for off, rd, page in refs[:10]:
    # Simple heuristic: look for function prologue before this address
    search_start = max(0, off - 0x1000)
    for j in range(off - 4, search_start, -4):
        instr = struct.unpack('<I', data[j:j+4])[0]
        # STP x29, x30, [sp, #-N]! pattern (function prologue)
        if (instr & 0xffc003ff) == 0xa9807bfd:
            print(f"  Function likely starts at 0x{j:08x}, uses S-box ref at 0x{off:08x}")
            break
