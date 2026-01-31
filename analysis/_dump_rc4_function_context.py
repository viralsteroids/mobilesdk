#!/usr/bin/env python3
"""Dump context around RC4 function references"""
import struct

SO_PATH = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"

# Key addresses found
RC4_REFS = [
    0x026387bc,  # Direct reference to S-box init
    0x02646700,  # Start of cipher cluster
]

with open(SO_PATH, "rb") as f:
    data = f.read()

for ref_addr in RC4_REFS:
    print(f"\n=== Context around 0x{ref_addr:08x} ===\n")

    # Find function start (look for prologue)
    func_start = None
    for j in range(ref_addr - 4, max(0, ref_addr - 0x2000), -4):
        instr = struct.unpack('<I', data[j:j+4])[0]
        # STP x29, x30, [sp, #-N]! or SUB sp, sp, #N patterns
        if (instr & 0xffc003ff) == 0xa9807bfd:  # STP with x29,x30
            func_start = j
            break
        if (instr & 0xff0003ff) == 0xd10003ff:  # SUB sp, sp
            func_start = j
            break

    if func_start:
        print(f"Function likely starts at: 0x{func_start:08x}")
        print(f"Function size estimate: ~{ref_addr - func_start} bytes to ref point")

    # Disassemble some instructions around the reference
    print(f"\nInstructions around reference:")
    start = max(0, ref_addr - 32)
    for i in range(start, min(len(data), ref_addr + 64), 4):
        instr = struct.unpack('<I', data[i:i+4])[0]
        marker = " <-- RC4 S-box ref" if i == ref_addr else ""
        print(f"  0x{i:08x}: {instr:08x}{marker}")

print("\n=== RC4 Function cluster (0x02646700 region) ===")
# This region has many S-box refs, likely the main RC4 function
cluster_start = 0x02646700 - 0x100
cluster_end = 0x02646b00

# Look for function prologue
for j in range(cluster_start, max(0, cluster_start - 0x1000), -4):
    instr = struct.unpack('<I', data[j:j+4])[0]
    if (instr & 0xffc003ff) == 0xa9807bfd:
        print(f"RC4 cipher function likely starts at: 0x{j:08x}")
        print(f"Size to cluster end: ~{cluster_end - j} bytes")
        break
