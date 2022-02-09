#!/usr/bin/python3

import csv
import re
import argparse, os

path = "../RawResults/"

benchmarks = ['bootique', 'commons-collections4', 'flink-core', 'jsonschema2pojo', 'maven-core', 'microbenchmark', 'mybatis', 'quartz-core', 'vraptor']
#benchmarks = ['microbenchmark']
base_analysis = ['basic-only', 'CI', 'CIPP', '1-object-sensitive']
call_graph_file = 'CallGraphEdge.csv'


clazz_set = set()
total_clazz_counter = 0

def dir_file(string):
    if os.path.isfile(string):
        return string
    else:
        raise FileNotFoundError(string)

with open('CallGraphEdgeSourceClassCounts.csv', mode='w') as outfile:
    writer = csv.writer(outfile)
    header = ['Benchmark', 'basic-only', 'CI', 'CIPP', '1-object-sens']
    writer.writerow(header)
    for benchmark in benchmarks:
        content_to_print = [benchmark]
        print("Benchmark: {}".format(benchmark))
        for analysis in base_analysis:
            curr_file = path + benchmark + "/" + analysis + "/" + call_graph_file
            clazz_set = set()
            total_clazz_counter = 0
            if os.path.isfile(curr_file):
                with open(curr_file, newline='') as csvfile:
                    reader = csv.reader(csvfile, delimiter='\t')
                    for row in reader:
                        a, context, b, method = row
                        context_method = context.split('/')[0]
                        clazz = context_method.replace("<", "").split(":")[0]
                        if clazz not in clazz_set:
                            clazz_set.add(clazz)
                            total_clazz_counter = total_clazz_counter + 1
                print("Base analysis: {}".format(analysis))
                print("total class counter: {}".format(total_clazz_counter))
                content_to_print.append(total_clazz_counter)
            else:
                content_to_print.append(0)
        writer.writerow(content_to_print)
