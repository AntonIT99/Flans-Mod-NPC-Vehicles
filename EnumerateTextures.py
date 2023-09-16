import os
from pathlib import Path

vehicles_directory = "./vehicles"
planes_directory = "./planes"

name = {}
model = {}
texture = {}
advpaintjob = {}

def read_files(directory, files):
    identifier = ""
    for txt_file in files:
        with open(directory + "/" + txt_file, "r", encoding="utf-8") as file:
            lines = file.readlines()
            for line in lines:
                if line.startswith("Model "):
                    identifier = line.split(" ")[1].split(".")[0].lower() + " "
            identifier += txt_file
            name[identifier] = txt_file
            for line in lines:
                line = line.strip()
                if line.startswith("//"):
                    continue
                if line.startswith("Model "):
                    model[identifier] = line
                if line.startswith("Texture "):
                    texture[identifier] = line
                if line.startswith("advpaintjob "):
                    if identifier not in advpaintjob.keys():
                        advpaintjob[identifier] = [line]
                    else:
                        advpaintjob[identifier].append(line)


vehicles_path = Path(vehicles_directory)
planes_path = Path(planes_directory)

if planes_path.exists() and planes_path.is_dir():
    planes_files = [file for file in os.listdir(planes_directory) if file.endswith(".txt")]
    read_files(planes_directory, planes_files)
if vehicles_path.exists() and vehicles_path.is_dir():
    vehicles_files = [file for file in os.listdir(vehicles_directory) if file.endswith(".txt")]
    read_files(vehicles_directory, vehicles_files)

with open("textures.txt", "w", encoding="utf-8") as file:
    for key in sorted(model.keys()):
        file.write(name[key] + "\n")
        file.write(model[key] + "\n")
        if key in texture.keys():
            file.write(texture[key] + "\n")
        if key in advpaintjob.keys():
            for paintjob in advpaintjob[key]:
                file.write(paintjob + "\n")
        file.write("\n")