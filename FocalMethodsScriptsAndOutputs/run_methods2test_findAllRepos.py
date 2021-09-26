import os
import json

traindir = os.path.abspath(os.path.join(os.path.dirname(__file__), '../methods2test/dataset/train'))
evaldir = os.path.abspath(os.path.join(os.path.dirname(__file__), '../methods2test/dataset/eval'))
testdir = os.path.abspath(os.path.join(os.path.dirname(__file__), '../methods2test/dataset/test'))

benchmarks = ["apache/commons-email", "martin-steghoefer/jgap", "x-stream/xstream"]
for subdir, dirs, files in os.walk(traindir):
    for file in files:
        str = file.split("_")
        if str[1] == '0.json':
            file_path = os.path.join(subdir, file)
            f = open(file_path)
            data = json.load(f)
            #for benchmark in benchmarks:
            #    if benchmark in data["repository"]["url"]:
            print(data["repository"]["url"])
            #print(str[0], data["repository"]["url"], data["test_case"]["class_method_signature"], data["focal_method"]["class_method_signature"])

for subdir, dirs, files in os.walk(evaldir):
    for file in files:
        str = file.split("_")
        if str[1] == '0.json':
            file_path = os.path.join(subdir, file)
            f = open(file_path)
            data = json.load(f)
            #for benchmark in benchmarks:
            #    if benchmark in data["repository"]["url"]:
            print(data["repository"]["url"])

for subdir, dirs, files in os.walk(testdir):
    for file in files:
        str = file.split("_")
        if str[1] == '0.json':
            file_path = os.path.join(subdir, file)
            f = open(file_path)
            data = json.load(f)
            #for benchmark in benchmarks:
            #    if benchmark in data["repository"]["url"]:
            print(data["repository"]["url"])
