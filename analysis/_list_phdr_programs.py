import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\temp\MobileSDK\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\temp\MobileSDK\ghidra_project_phdr")
PROJECT_NAME = "so_files_decompiled_phdr"

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
proj_data = project.getProjectData()
root = proj_data.getRootFolder()
print("Project root:", root.getName())
files = root.getFiles()
for f in files:
    print("-", f.getName())
project.close()
