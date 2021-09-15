import csv
import re
import argparse, os

path = "analysis_output/MockAnalysis/"

def dir_file(string):
    if os.path.isfile(string):
        return string
    else:
        raise FileNotFoundError(string)

parser = argparse.ArgumentParser()
parser.add_argument('--file', default=path+'jsonschema2pojo_core_1.1.1-test-cases-without-intraproc-mocks', type=dir_file)

args = parser.parse_args()

clazz_method_map = {}
running_str = "mvn -Dtest="

with open(args.file, newline='') as csvfile:
    reader = csv.reader(csvfile, delimiter=' ')
    curr = None
    for i, row in enumerate(reader):
        clazz, method = row
        if clazz in clazz_method_map:
            clazz_method_map[clazz].add(method)
        else:
            clazz_method_map[clazz] = set()
            clazz_method_map[clazz].add(method)

for key, value in clazz_method_map.items():
    curr_str = key
    for i, val in enumerate(value):
        if i == 0:
            curr_str += "#" + val
        else:
            curr_str += "+" + val
    running_str += curr_str + ","

output_str = running_str[:-1] + " test"
print(output_str)
