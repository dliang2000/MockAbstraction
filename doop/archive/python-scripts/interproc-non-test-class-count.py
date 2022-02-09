#!/usr/bin/python3

import csv
import re
import argparse, os

path = "../RawResults/"

benchmarks = ['bootique', 'commons-collections4', 'flink-core', 'jsonschema2pojo', 'maven-core', 'microbenchmark', 'mybatis', 'quartz-core', 'vraptor']
mock_invocation_file = 'isMockInvocation.csv'

total_report = 0
total_non_test_clazz_counter = 0

def dir_file(string):
    if os.path.isfile(string):
        return string
    else:
        raise FileNotFoundError(string)

with open('NonTestClassCount.csv', mode='w') as outfile:
    writer = csv.writer(outfile)
    header = ['Benchmark', 'total number of rows', 'non-test-class-counter']
    writer.writerow(header)
    for benchmark in benchmarks:
        content_to_print = [benchmark]
        print("Benchmark: {}".format(benchmark))
        curr_file = path + benchmark + "/" + "CI" + "/" + "NORMAL" + "/" + mock_invocation_file
        total_report = 0
        total_non_test_clazz_counter = 0
        if os.path.isfile(curr_file):
            #print("file found")
            with open(curr_file, newline='') as csvfile:
                reader = csv.reader(csvfile, delimiter='\t')
                for row in reader:
                    total_report = total_report + 1
                    clazz = row[0]
                    if "Test" not in clazz:
                        #print(clazz)
                        total_non_test_clazz_counter = total_non_test_clazz_counter + 1
            print("total # of rows in isMockInvocation.csv: {}".format(total_report))
            print("total non test class counter: {}".format(total_non_test_clazz_counter))
            content_to_print.append(total_report)
            content_to_print.append(total_non_test_clazz_counter)
        else:
            content_to_print.append(0)
        writer.writerow(content_to_print)
