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
parser.add_argument('--file', default='last-analysis/isMockInvocation.csv', type=dir_file)

args = parser.parse_args()

results_by_class = {}
sig_re = re.compile(r"<([(\w|\$|\.)]+): ([(\w|\$|\.)]+(\[\])? (((\w|\$|\.)+)|(<init>)|(<clinit>))\(.*\))>")
with open(args.file, newline='') as csvfile:
    reader = csv.reader(csvfile, delimiter='\t')
    for row in reader:
        mi, signature, inMethod, line, receiver = row
        mi_sig, mi_caller, mi_index = mi.split('/')
        receiver_sig, receiver_local = receiver.split('/')
        assert receiver_sig == mi_sig

        m = re.match(sig_re, mi_sig)
        if m:
            results_by_method = results_by_class.get(m.group(1), {})
            results_by_method[m.group(2)] = results_by_method.get(m.group(2), 0) + 1
            results_by_class[m.group(1)] = results_by_method
        else:
            print ('warning: bad line '+str(row))

for claz in sorted(results_by_class.keys()):
    for meth in sorted(results_by_class[claz].keys()):
        print ("{}: {} {}".format(claz, meth, results_by_class[claz][meth]))
