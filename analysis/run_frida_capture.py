import argparse
import datetime
import json
import os
import sys
import time
import subprocess

try:
    import frida
except ImportError:
    sys.stderr.write("Missing dependency: frida (pip install frida)\n")
    raise


def _log_line(log_fp, message):
    timestamp = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    line = f"[{timestamp}] {message}"
    print(line)
    log_fp.write(line + "\n")
    log_fp.flush()


def _format_message(message, data):
    msg_type = message.get("type")
    if msg_type == "send":
        payload = message.get("payload")
        if isinstance(payload, (dict, list)):
            payload_text = json.dumps(payload, ensure_ascii=True)
        else:
            payload_text = str(payload)
        text = f"SCRIPT: {payload_text}"
    elif msg_type == "error":
        text = f"ERROR: {message.get('stack') or message.get('description') or message}"
    else:
        text = f"EVENT: {message}"

    if data is not None:
        text += f" (data {len(data)} bytes)"
    return text


def main():
    parser = argparse.ArgumentParser(
        description="Run Frida hook without frida.exe by using the Python API."
    )
    parser.add_argument(
        "--package",
        "-p",
        required=True,
        help="Android package name to attach/spawn.",
    )
    mode_group = parser.add_mutually_exclusive_group(required=True)
    mode_group.add_argument(
        "--spawn",
        action="store_true",
        help="Spawn the package, then attach.",
    )
    mode_group.add_argument(
        "--attach",
        action="store_true",
        help="Attach to a running process.",
    )
    parser.add_argument(
        "--log",
        required=True,
        help="Path to write runner output.",
    )
    parser.add_argument(
        "--remote",
        help="Connect to a remote Frida endpoint (host:port), e.g. 127.0.0.1:27042 for gadget.",
    )
    parser.add_argument(
        "--wait",
        type=int,
        default=0,
        help="Optional time limit in seconds (0 = run until Ctrl+C).",
    )
    parser.add_argument(
        "--monkey",
        action="store_true",
        help="Send a launcher monkey event after attaching.",
    )
    args = parser.parse_args()

    root_dir = os.path.abspath(os.path.join(os.path.dirname(__file__), os.pardir))
    script_path = os.path.join(root_dir, "tools/frida/frida_bundle_decrypt_hook.js")

    if not os.path.isfile(script_path):
        sys.stderr.write(f"Hook script not found: {script_path}\n")
        return 2

    log_path = os.path.abspath(args.log)
    log_dir = os.path.dirname(log_path)
    if log_dir:
        os.makedirs(log_dir, exist_ok=True)

    with open(log_path, "a", encoding="utf-8") as log_fp:
        _log_line(log_fp, "Starting Frida runner.")
        _log_line(log_fp, f"Package: {args.package}")
        _log_line(log_fp, f"Mode: {'spawn' if args.spawn else 'attach'}")
        _log_line(log_fp, f"Hook: {script_path}")

        try:
            if args.remote:
                device = frida.get_device_manager().add_remote_device(args.remote)
            else:
                device = frida.get_usb_device(timeout=10)
        except Exception as exc:
            _log_line(log_fp, f"Failed to get USB device: {exc}")
            return 3

        pid = None
        try:
            if args.spawn:
                if args.remote:
                    _log_line(log_fp, "Spawn is not supported for --remote devices.")
                    return 4
                pid = device.spawn([args.package])
                _log_line(log_fp, f"Spawned PID: {pid}")
                session = device.attach(pid)
            else:
                try:
                    session = device.attach(args.package)
                except frida.ProcessNotFoundError:
                    # Fallback: pidof package
                    try:
                        if args.remote:
                            procs = device.enumerate_processes()
                            if procs:
                                pid = procs[0].pid
                                _log_line(log_fp, f"Remote fallback PID: {pid} ({procs[0].name})")
                                session = device.attach(pid)
                                raise StopIteration
                            raise frida.ProcessNotFoundError("remote enumerate returned empty")
                        adb_path = os.path.join(root_dir, "platform-tools", "adb.exe")
                        if not os.path.isfile(adb_path):
                            adb_path = "adb"
                        out = subprocess.check_output(
                            [adb_path, "shell", "pidof", args.package], text=True
                        ).strip()
                        if out:
                            pid = int(out.split()[0])
                            _log_line(log_fp, f"Resolved PID via pidof: {pid}")
                            session = device.attach(pid)
                        else:
                            raise frida.ProcessNotFoundError("pidof returned empty")
                    except StopIteration:
                        pass
                    except Exception as exc:
                        _log_line(log_fp, f"Process not found: {exc}")
                        return 4
        except frida.ProcessNotFoundError as exc:
            _log_line(log_fp, f"Process not found: {exc}")
            return 4
        except Exception as exc:
            _log_line(log_fp, f"Attach/spawn failed: {exc}")
            return 5

        try:
            with open(script_path, "r", encoding="utf-8") as script_fp:
                script_source = script_fp.read()
        except Exception as exc:
            _log_line(log_fp, f"Failed to read hook script: {exc}")
            return 6

        script = session.create_script(script_source)
        script.on("message", lambda m, d: _log_line(log_fp, _format_message(m, d)))
        script.load()
        _log_line(log_fp, "Hook script loaded.")

        if args.spawn and pid is not None:
            device.resume(pid)
            _log_line(log_fp, "Spawned process resumed.")

        if args.monkey:
            try:
                adb_path = os.path.join(root_dir, "platform-tools", "adb.exe")
                if not os.path.isfile(adb_path):
                    adb_path = "adb"
                subprocess.run(
                    [adb_path, "shell", "monkey", "-p", args.package, "-c", "android.intent.category.LAUNCHER", "1"],
                    check=False,
                )
                _log_line(log_fp, "Monkey event sent.")
            except Exception as exc:
                _log_line(log_fp, f"Monkey event failed: {exc}")

        try:
            if args.wait > 0:
                _log_line(log_fp, f"Running for {args.wait} seconds.")
                time.sleep(args.wait)
                _log_line(log_fp, "Time limit reached, stopping...")
            else:
                _log_line(log_fp, "Press Ctrl+C to stop.")
                try:
                    while True:
                        time.sleep(0.5)
                except KeyboardInterrupt:
                    _log_line(log_fp, "Stopping...")
        finally:
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
    raise SystemExit(main())
