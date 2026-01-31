from __future__ import annotations

import argparse
import ast
import zlib
from dataclasses import dataclass
from pathlib import Path

OUTPUT_LIMIT = 1_048_576
READ_CHUNK = 64 * 1024
SAMPLE_LIMIT = 64

MODES: dict[str, int] = {
    "gzip": zlib.MAX_WBITS | 16,
    "zlib": zlib.MAX_WBITS,
    "raw": -zlib.MAX_WBITS,
}


@dataclass
class ExtractResult:
    file: str
    offset: int
    hint: str
    mode: str
    status: str
    out_bytes: int
    truncated: bool
    eof: bool
    error: str
    sample_hex: str
    sample_ascii: str


def parse_magic_hits(value: str) -> list[tuple[int, str]]:
    if not value:
        return []
    value = value.strip()
    if not value or value == "[]":
        return []
    try:
        parsed = ast.literal_eval(value)
    except (ValueError, SyntaxError):
        return []
    hits: list[tuple[int, str]] = []
    for item in parsed:
        if isinstance(item, (list, tuple)) and len(item) >= 2:
            try:
                offset = int(item[0])
            except (TypeError, ValueError):
                continue
            hint = str(item[1])
            hits.append((offset, hint))
    return hits


def split_fields(line: str) -> list[str]:
    fields: list[str] = []
    current: list[str] = []
    depth = 0
    in_quote = False
    escape = False
    for ch in line.rstrip("\r\n"):
        if ch == "\\" and not escape:
            escape = True
            current.append(ch)
            continue
        if ch == "'" and not escape:
            in_quote = not in_quote
            current.append(ch)
            continue
        escape = False
        if not in_quote:
            if ch in "[(":
                depth += 1
            elif ch in "])":
                if depth > 0:
                    depth -= 1
            if ch == "," and depth == 0:
                fields.append("".join(current).strip())
                current = []
                continue
        current.append(ch)
    fields.append("".join(current).strip())
    return fields


def resolve_input_file(name: str, base_dir: Path) -> Path | None:
    candidate = Path(name)
    if candidate.is_file():
        return candidate
    candidate = base_dir / name
    if candidate.is_file():
        return candidate
    search_roots = [
        base_dir / "offline_xor_out",
        base_dir / "analysis",
        base_dir / "analysis" / "bundles",
    ]
    for root in search_roots:
        direct = root / name
        if direct.is_file():
            return direct
        by_name = root / Path(name).name
        if by_name.is_file():
            return by_name
    return None


def sample_ascii(data: bytes) -> str:
    if not data:
        return "-"
    out = []
    for byte in data:
        if 32 <= byte <= 126:
            out.append(chr(byte))
        else:
            out.append(".")
    text = "".join(out)
    return text.replace("|", "\\|").replace("`", "'")


def try_decompress(path: Path, offset: int, mode: str) -> ExtractResult:
    sample = bytearray()
    out_bytes = 0
    truncated = False
    eof = False
    error = ""
    status = "empty"
    wbits = MODES[mode]

    try:
        with path.open("rb") as handle:
            handle.seek(offset)
            inflater = zlib.decompressobj(wbits)
            while True:
                chunk = handle.read(READ_CHUNK)
                if not chunk:
                    break
                try:
                    produced = inflater.decompress(chunk, OUTPUT_LIMIT - out_bytes)
                except zlib.error as exc:
                    error = str(exc)
                    status = "error"
                    break
                if produced:
                    if len(sample) < SAMPLE_LIMIT:
                        take = min(SAMPLE_LIMIT - len(sample), len(produced))
                        sample.extend(produced[:take])
                    out_bytes += len(produced)
                if out_bytes >= OUTPUT_LIMIT:
                    truncated = True
                    status = "ok_trunc"
                    break
                if inflater.eof:
                    eof = True
                    status = "ok_eof"
                    break
            if status not in {"error", "ok_trunc"}:
                try:
                    tail = inflater.flush()
                except zlib.error as exc:
                    error = str(exc)
                    status = "error"
                else:
                    if tail:
                        if len(sample) < SAMPLE_LIMIT:
                            take = min(SAMPLE_LIMIT - len(sample), len(tail))
                            sample.extend(tail[:take])
                        out_bytes += len(tail)
                    if status == "empty":
                        if out_bytes > 0:
                            status = "ok_noeof"
                    if status.startswith("ok") and not eof and out_bytes == 0:
                        status = "empty"
    except OSError as exc:
        error = str(exc)
        status = "error"

    if status == "empty" and out_bytes > 0:
        status = "ok_noeof"

    sample_hex = sample.hex() if sample else "-"
    sample_text = sample_ascii(sample)
    return ExtractResult(
        file=str(path),
        offset=offset,
        hint="",
        mode=mode,
        status=status,
        out_bytes=out_bytes,
        truncated=truncated,
        eof=eof,
        error=error,
        sample_hex=sample_hex,
        sample_ascii=sample_text,
    )


def build_report(results: list[ExtractResult], csv_path: Path) -> str:
    total = len(results)
    ok = sum(1 for r in results if r.status.startswith("ok"))
    err = sum(1 for r in results if r.status == "error")
    trunc = sum(1 for r in results if r.truncated)
    empty = sum(1 for r in results if r.status == "empty")
    files = sorted({r.file for r in results})

    paragraph1 = (
        f"Checked offsets from {csv_path.name}: {total} decompression attempts "
        f"(gzip/zlib/raw) with an output cap of {OUTPUT_LIMIT} bytes."
    )
    paragraph2 = (
        f"Successful attempts: {ok}, errors: {err}, empty results: {empty}, "
        f"truncated by limit: {trunc}."
    )

    lines: list[str] = ["# Stream extract report", "", paragraph1, "", paragraph2, ""]
    lines.append("## Results")
    lines.append("")
    lines.append(
        "| file | offset | hint | mode | status | out_bytes | sample_hex | sample_ascii |"
    )
    lines.append(
        "| --- | --- | --- | --- | --- | --- | --- | --- |"
    )
    for result in results:
        sample_hex = f"`{result.sample_hex}`" if result.sample_hex != "-" else "-"
        sample_ascii = f"`{result.sample_ascii}`" if result.sample_ascii != "-" else "-"
        hint = result.hint or "-"
        status = result.status
        if result.status == "error" and result.error:
            status = f"error:{result.error}"
        lines.append(
            f"| {Path(result.file).name} | {result.offset} | {hint} | {result.mode} "
            f"| {status} | {result.out_bytes} | {sample_hex} | {sample_ascii} |"
        )

    lines.append("")
    lines.append("## Files")
    lines.append("")
    for file_name in files:
        lines.append(f"- {Path(file_name).name}")

    return "\n".join(lines) + "\n"


def main() -> int:
    parser = argparse.ArgumentParser(
        description="Probe gzip/zlib/raw streams at offsets from CSV."
    )
    parser.add_argument(
        "--csv",
        dest="csv_path",
        default="_offline_layer2_probe.csv",
        help="CSV with magic_hits offsets.",
    )
    parser.add_argument(
        "--report",
        dest="report_path",
        default="analysis/stream_extract_report.md",
        help="Report output path.",
    )
    args = parser.parse_args()

    csv_path = Path(args.csv_path)
    if not csv_path.is_file():
        raise SystemExit(f"CSV not found: {csv_path}")

    base_dir = csv_path.parent
    results: list[ExtractResult] = []

    lines = csv_path.read_text(encoding="utf-8").splitlines()
    if not lines:
        raise SystemExit(f"CSV is empty: {csv_path}")
    header = split_fields(lines[0])
    for line in lines[1:]:
        if not line.strip():
            continue
        fields = split_fields(line)
        if len(fields) != len(header):
            if len(fields) > len(header):
                fields = fields[: len(header) - 1] + [",".join(fields[len(header) - 1 :])]
            else:
                fields = fields + [""] * (len(header) - len(fields))
        row = dict(zip(header, fields))
        name = row.get("file", "")
        hits = parse_magic_hits(row.get("magic_hits", ""))
        if not hits:
            continue
        target = resolve_input_file(name, base_dir)
        if target is None:
            for offset, hint in hits:
                for mode in MODES:
                    results.append(
                        ExtractResult(
                            file=name,
                            offset=offset,
                            hint=hint,
                            mode=mode,
                            status="error",
                            out_bytes=0,
                            truncated=False,
                            eof=False,
                            error="file not found",
                            sample_hex="-",
                            sample_ascii="-",
                        )
                    )
            continue
        for offset, hint in hits:
            for mode in MODES:
                result = try_decompress(target, offset, mode)
                result.hint = hint
                results.append(result)

    report_path = Path(args.report_path)
    report_path.parent.mkdir(parents=True, exist_ok=True)
    report_path.write_text(build_report(results, csv_path), encoding="utf-8")
    print(f"Report written to {report_path}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
