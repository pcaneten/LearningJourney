import os

def find(path, dir):
    try:
        os.chdir(path)
    except OSError:
        return
    for directory in reversed(os.listdir()):
        found_path = path.lstrip(".") + "/" + directory
        if directory == dir:
            print("..." + found_path)
        find(found_path,dir)






