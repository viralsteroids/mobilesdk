import argparse
import os
import sys
import time
import subprocess

try:
    import frida
except ImportError:
    sys.stderr.write("Missing dependency: frida (pip install frida)\n")
    raise


def adb_path(root):
    candidates = [
        os.path.join(root, "platform-tools", "adb.exe"),
        r"C:\\Users\\Asus\\AppData\\Local\\Android\\Sdk\\platform-tools\\adb.exe",
        "adb",
    ]
    for c in candidates:
        if os.path.isfile(c):
            return c
    return "adb"


def adb_forward(adb, port):
    subprocess.run([adb, "forward", f"tcp:{port}", f"tcp:{port}"], check=False)


def adb_monkey(adb, package):
    subprocess.run([adb, "shell", "monkey", "-p", package, "-c", "android.intent.category.LAUNCHER", "1"], check=False)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--package", required=True)
    ap.add_argument("--script", required=True)
    ap.add_argument("--port", type=int, default=27042)
    ap.add_argument("--wait", type=int, default=120)
    ap.add_argument("--monkey", action="store_true")
    args = ap.parse_args()

    root_dir = os.path.abspath(os.path.join(os.path.dirname(__file__), os.pardir))
    adb = adb_path(root_dir)

    if not os.path.isfile(args.script):
        print(f"Script not found: {args.script}")
        return 1

    adb_forward(adb, args.port)
    if args.monkey:
        adb_monkey(adb, args.package)

    mgr = frida.get_device_manager()
    device = mgr.add_remote_device(f"127.0.0.1:{args.port}")
    procs = device.enumerate_processes()
    target = None
    for p in procs:
        if p.name == args.package:
            target = p
            break
    if target is None:
        target = procs[0] if procs else None
    if target is None:
        print("No processes exposed by gadget.")
        return 2

    session = device.attach(target.pid)
    with open(args.script, "r", encoding="utf-8") as f:
        src = f.read()
    script = session.create_script(src)
    script.on("message", lambda m, d: print(m))
    script.load()
    print(f"Attached to gadget process: {target.name} (pid {target.pid})")
    print(f"Running for {args.wait} seconds...")
    time.sleep(args.wait)
    try:
        script.unload()
    except Exception:
        pass
    try:
        session.detach()
    except Exception:
        pass
    return 0


if __name__ == "__main__":
    sys.exit(main())
