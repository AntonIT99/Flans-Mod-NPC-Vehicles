import os
import re
import shutil

# Regular expression to find the class name and its superclass
class_pattern = re.compile(r'class\s+(\w+)\s+extends\s+(\w+)')

# Get a list of all Java files in the current directory
java_files = [filename for filename in os.listdir() if filename.endswith(".java")]

# Loop through each Java file and process it
for filename in java_files:
    with open(filename, 'r') as file:
        content = file.read()
        match = class_pattern.search(content)
        if match:
            class_name = match.group(1)
            superclass_name = match.group(2)
            
            # Create the destination subdirectory if it doesn't exist
            if not os.path.exists(superclass_name):
                os.makedirs(superclass_name)
            
            # Copy the Java file to the appropriate subdirectory
            destination = os.path.join(superclass_name, filename)
            shutil.copy(filename, destination)
            print(f"Copied {filename} to {superclass_name}/{filename}")
        else:
            print(f"Could not find superclass in {filename}")

print("Finished copying Java files.")