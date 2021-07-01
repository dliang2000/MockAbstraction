#!/usr/bin/python3

import csv
import re
import argparse, os

def dir_file(string):
    if os.path.isfile(string):
        return string
    else:
        raise FileNotFoundError(string)

parser = argparse.ArgumentParser()
parser.add_argument('--file', default='microbenchmark-results/basic-new-counts-NO_INTERPROC', type=dir_file)
parser.add_argument('--package', default='ca.liang')

args = parser.parse_args()

total_calls = 0

with open(args.file, newline='') as csvfile:
    data = csv.reader(csvfile, delimiter=' ')
    for row in data:
        clazz, return_type, meth, count = row
        if args.package in clazz:
            total_calls = total_calls + int(count)
        else:
            print("Removed row: {}".format(row))
            continue;

print("Total number of mock counts in {} is {} ".format(args.file, total_calls))
