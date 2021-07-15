#!/usr/bin/python3

import csv
import re
import argparse, os

path = "souffle-time-results/hyperfine_results/"

benchmarks = ['bootique', 'commons-collections4', 'flink-core', 'jsonschema2pojo', 'maven-core', 'microbenchmark', 'mybatis', 'quartz-core', 'vraptor']
base_analysis = ['basic-only', 'context-insensitive', 'context-insensitive-plusplus', '1-object-sensitive']
flags = ['NO_INTERPROC', 'NORMAL']

def dir_file(string):
    if os.path.isfile(string):
        return string
    else:
        raise FileNotFoundError(string)

#parser = argparse.ArgumentParser()
#parser.add_argument('--file', default='microbenchmark-results/basic-new-counts-NO_INTERPROC', type=dir_file)
#parser.add_argument('--package', default='ca.liang')

#args = parser.parse_args()

#total_calls = 0

with open('hyperfine_runtime.csv', mode='w') as outfile:
    writer = csv.writer(outfile)
    header = ['benchmark', 'basic-only-intraproc (s)', 'CI-intraproc (s)', 'CIPP-intraproc (s)', '1-object-sens-intraproc (s)',
                'basic-only-interproc (s)', 'CI-interproc (s)', 'CIPP-interproc (s)', '1-object-sens-interproc (s)']
    writer.writerow(header)
    for benchmark in benchmarks:
        content_to_print = [benchmark]
        for flag in flags:
            for analysis in base_analysis:
                file = path + benchmark + "-" + analysis + "-" + flag +'.csv'
                with open(file, newline='') as csvfile:
                    reader = csv.reader(csvfile, delimiter=',')
                    next(reader, None)  # skip the headers
                    for row in reader:
                        command, mean, stddev, median, user, system, min, max = row
                        data = str(round(float(mean), 4)) + u'\u00b1' + str(round(float(stddev), 4))
                        content_to_print.append(data)
                        print("File: {}".format(file))
                        print("Mean: {}".format(data))
        writer.writerow(content_to_print)
