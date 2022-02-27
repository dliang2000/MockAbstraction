### Focal Method Algorithms/Analysis

Data Processing:

```
KLoC - use SLOCCOUNT
methods2test reported focal methods - processed from their dataset tar file
Ghafari's reported focal methods - Collected from their paper
Total Number of Tests - Obtained from “mvn clean test”
percentage of test cases with focal methods detected - reported focal methods / total number of tests
```

### methods2test Recall data

Repository: https://github.com/microsoft/methods2test

| Benchmark | KLoC (Source Code) | methods2test reported focal methods | Total Number of Tests | percentage of test cases with focal methods detected |
| --- | --: | --: | --: | --: |
| GojaFramework/goja/goja-core | 11.52 | 27 | 80 | 34% |
| optiq/core | 93.94 | 26 | 1346 | 2% |
| mock-socket | 1.09 | 4 | 34 | 12% |
| project-sunbird/sunbird-lms-service | 45.36 | 310 | 984 | 31% |
| Geometric Mean | N/A | N/A | N/A | 12% |

methods2test dataset ID:

GojaFramework/goja/goja-core : 41280112 (use grep to search 'goja-core')

optiq/core: 5320077 (use grep to search 'core')

mock-socket: 1814028

project-sunbird/sunbird-lms-service: 96121797


### Ghafari's Recall data

(No open-source repository found for the benchmark)

Paper: https://www.researchgate.net/publication/295918716_Automatically_Identifying_Focal_Methods_Under_Test_in_Unit_Test_Cases

| Benchmark | KLoC (Source Code) | Ghafari's reported focal methods | Total Number of Tests | percentage of test cases with focal methods detected |
| --- | --: | --: | --: | --: |
| Commons Email (1.3.3) | 8.78 | 90 | 130 | 69% |
| JGAP (3.4.4) | 73.96 | 1015 | 1390 | 73% |
| PureMVC (1.0.8) | 19.46 | 34 | 43 | 79% |
| XStream (1.4.4) | 54.93 | 513 | 968 | 53% |
| Geometric Mean | N/A | N/A | N/A | 68% |


### Test Coverages

```
# The Test Coverage reports are saved under directory named "TestCoverageReport" for each benchmark.
# The pom.xml files were updated with maven-surefire-plugin and jacoco-maven-plugin to generate the coverage reports.

# With both plugins included in pom.xml file, "mvn clean test" will auto-generate coverage reports for all test cases.
# (Remember to save the coverage reports somewhere else or it will later be overwritten.)

# To generate coverages for test cases without intraproc mocks, uncomment "printTestsWithoutIntraprocMock();" in MockAnalysisIntraprocTransformer and run intraprocedural Soot mock analysis. It will output a file, MOCK_INTRAPROC_TEST_CASES, containing names for test cases with intraprocedural mocks. (Located in analysis_output/MockAnalysis/)

# Run the following command to generate the corresponding mvn command excluding test cases with intraprocedural mocks, then run the mvn command to generate a second coverage reports.

python mvn_command_generator.py --file analysis_output/MockAnalysis/MOCK_INTRAPROC_TEST_CASES
```

| Benchmark | Code Coverage - All Tests | Code Coverage - Test Cases without Intraproc Mocks | Branch Coverage - All Tests | Branch Coverage - Test Cases without Intraproc Mocks |
| --- | --: | --: | --: | --: |
| commons-collections4-4.4 | 86% | 72% | 81% | 66% |
| flink-core-1.13.0-rc1 | 54% | 43% | 44% | 33% |
| jsonschema2pojo-core-1.1.1 | 37% | 24% | 33% | 19% |
| maven-core-3.8.1 | 48% | 48% | 39% | 38% |
| microbenchmark | 78% | 51% | 100% | 100% |
| mybatis-3.5.6 | 85% | 81% | 82% | 76% |
| vraptor-core-3.5.5 | 87% | 59% | 81% | 56% |

Benchmarks with more reliable test coverages data: jsonschema2pojo-core-1.1.1, maven-core-3.8.1, microbenchmark, mybatis-3.5.6, vraptor-core-3.5.5

bootique's "mvn clean test" has a selective list of test cases running (trying to figure out the configuration)

quartz's run with test cases excluding intracproc mock objects would result in no test case running (likely configuration issue as well)

commons-collections4-4.4 has many abstract test classes, so the selection of test cases without intraproc mock objects is inaccurate.

flink-core-1.13.0-rc1's test run of test cases without intraproc mock objects produces errors not existing in "mvn clean test".


### Doop Tables

#### Number of source classes in the call graph from CallGraphEdge.csv

```
# Located in bin/python-scripts, you may need to update or rewrite the path parameter
if the results or the script is moved to other places.
The output from the python script is in CSV format, you may redirect the output into a CSV file.

python callgraph-source-classes-count.py
```

| Benchmark | basic-only NORMAL | CI NORMAL | CIPP NORMAL | 1-object-sens NORMAL |
| --- | --: | --: | --: | --: |
| bootique-2.0.B1-bootique | 12187 | 3683 | 3678 | 3394 |
| commons-collections4-4.4 | 8576 | 2762 | 2757 | 2726 |
| flink-core-1.13.0-rc1 | 17381 | 3962 | 3946 | 3928 |
| jsonschema2pojo-core-1.1.1 | 16876 | 2976 | 2967 | 2962 |
| maven-core-3.8.1 | 13228 | 2858 | 2849 | 2845 |
| microbenchmark | 7227 | 1603 | 1603 | 1591 |
| mybatis-3.5.6 | 31778 | 4774 | 4771 | 0 |
| quartz-core-2.3.1 | 11036 | 2919 | 2918 | 2906 |
| vraptor-core-3.5.5 | 18294 | 4352 | 4339 | 4335 |


#### CallGraphEdge.csv size

```
# Manually checked the size of the CallGraphEdge.csv file generated in each Doop run. We report raw size (bytes) here.
```

| Benchmark | basic-only-normal (MB) | CI-normal (MB) | CIPP-normal (MB) | 1-object-sens-NORMAL (MB) |
| --- | --: | --: | --: | --: |
| bootique-2.0.B1-bootique | 91.0 | 48.2 | 136.4 | 35.3 |
| commons-collections4-4.4 | 65.2 | 36.1 | 51.5 | 23.5 |
| flink-core-1.13.0-rc1 | 131.8 | 46.8 | 97.3 | 33.3 |
| jsonschema2pojo-core-1.1.1 | 121.0 | 40.2 | 85.5 | 31.0 |
| maven-core-3.8.1 | 94.2 | 28.7 | 46.1 | 20.8 |
| microbenchmark | 50.1 | 14.1 | 24.0 | 10.8 |
| mybatis-3.5.6 | 286.1 | 52.8 | 127.8 | N/A |
| quartz-core-2.3.1 | 95.5 | 31.5 | 66.8 | 23.7 |
| vraptor-core-3.5.5 | 134.0 | 50.3 | 85.7 | 37.8 |
| Average | 118.77 | 38.74 | 80.12 | 27.02 |


#### Doop's runtime on mock analysis (per analysis flavour)
```
# Run bin/doop-scripts/hyperfine_BENCHMARK.sh to generate hyperfine timing results for running the analysis itself on aech benchmark. You have to first generate relations for this to work, i.e. you've already run `bin/doop-scripts/doop_all_X.sh`. Hyperfine script may be out of date; you should probably compare to what's in `bin/doop-scripts/_doop_X.sh`, which is authoritative.

# To process the hyperfine results into csv table (you may need to update the path parameter in the python script if the results or the script are moved):
python bin/python-scripts/process-hyperfine-runtime.py.

# The output from the python script is in CSV format. You may redirect the output into a CSV file.

```

| Benchmark |basic-only-intraproc (s)|stddev|CI-intraproc (s)|stddev|CIPP-intraproc (s)|stddev|1-object-sens-intraproc (s)|stddev|basic-only-interproc (s)|stddev|CI-interproc (s)|stddev |CIPP-interproc (s)|stddev|1-object-sens-interproc (s)|stddev |
| --- | --: | --: | --: | --: | --: | --: | --: | --: | --: | --: | --: | --: | --: | --: | --: | --: |
| bootique-2.0.B1-bootique | 21.2622 | 1.7252 | 19.9262 | 1.8543 | 19.5066 | 1.7403 | 18.545 | 1.9442 | 26.4354 | 1.7282 | 24.8976 | 0.6917 | 25.4992 | 1.689 | 19.4426 | 0.9488 |
| commons-collections4-4.4 | 15.3868 | 1.388 | 14.1988 | 1.3571 | 14.4779 | 0.9716 | 13.389 | 1.0837 | 17.7987 | 1.424 | 16.6437 | 1.0578 | 16.8178 | 0.792 | 15.6146 | 1.595 |
| flink-core-1.13.0-rc1 | 29.8686 | 2.2869 | 27.2052 | 3.3438 | 27.7817 | 4.5403 | 21.1715 | 0.486 | 68.2585 | 1.9783 | 62.1225 | 3.9866 | 63.9409 | 5.6385 | 54.1053 | 0.3201 |
| jsonschema2pojo-core-1.1.1 | 31.7246 | 1.4357 | 29.3279 | 2.3252 | 30.7203 | 3.5204 | 29.3453 | 3.6939 | 39.7645 | 2.3264 | 41.0484 | 2.8956 | 35.3653 | 1.9621 | 37.2899 | 4.5524 |
| maven-core-3.8.1 | 20.4005 | 0.9683 | 19.4908 | 1.7984 | 16.0885 | 1.6083 | 15.7169 | 1.0893 | 26.412 | 1.6047 | 23.4187 | 1.9757 | 22.1553 | 1.8152 | 19.6182 | 1.7497 |
| microbenchmark | 13.1999 | 0.7592 | 11.729 | 0.7322 | 11.6105 | 0.5862 | 12.2276 | 1.148 | 13.7641 | 1.0326 | 12.9192 | 0.9476 | 13.0155 | 1.1839 | 12.2988 | 1.5261 |
| mybatis-3.5.6 | 83.2945 | 5.5664 | 59.8329 | 4.0663 | 59.7556 | 0.5937 | 46.1638 | 2.634 | 113.3817 | 4.5729 | 192.161 | 23.3635 | 181.9194 | 4.0075 | 68.1988 | 14.6018 |
| quartz-core-2.3.1 | 21.9468 | 2.2774 | 21.0579 | 2.0824 | 18.882 | 2.8425 | 17.2204 | 1.9094 | 23.4928 | 2.4233 | 21.9184 | 1.8406 | 21.9726 | 1.7784 | 19.8037 | 2.7528 |
| vraptor-core-3.5.5 | 49.27 | 2.5855 | 34.9573 | 0.7945 | 36.4874 | 1.8155 | 35.7696 | 1.9466 | 70.9163 | 2.8494 | 149.3771 | 5.7287 | 148.3501 | 2.615 | 138.4228 | 2.6788 |
| Average | 31.8171 | 2.507 | 26.414 | 2.2886 | 26.1456 | 2.3953 | 23.2832 | 1.992 | 44.4693 | 2.4241 | 60.5007 | 8.2512 | 58.7818 | 2.7865 | 42.755 | 5.3503 |


#### Soot and Doop Mock counts comparison

```
Soot's mock counts were manually added from the output (in analysis_output), which you get after running `bin/soot-scripts/runall_MockAnalysis_Intra.sh`.

Locate
"Total Invocations"
"Invocations On Mocks:"
in the Soot output.

# Run the following command to generate mock counts for Doop's mock counts
# You may need to update the keys for MYMAP so it recognizes each benchmark's results folder
bin/python_scripts/runall_process_counts.sh
```

| Benchmark | Total Number of Invocations | Mock Invokes intraproc (Soot) | basic-only-intraproc | CI-intraproc | CIPP-intraproc | 1-object-sens-intraproc | basic-only-interproc | CI-interproc | CIPP-interproc | 1-object-sens-interproc |
| --- | --: | --: | --: | --: | --: | --: | --: | --: | --: | --: |
| bootique-2.0.B1-bootique | 3366 | 99 | 99 | 99 | 99 | 0 | 120 | 122 | 122 | 0 |
| commons-collections4-4.4 | 12753 | 11 | 3 | 3 | 3 | 3 | 23 | 23 | 23 | 23 |
| flink-core-1.13.0-rc1 | 11923 | 40 | 40 | 40 | 40 | 40 | 1262 | 1389 | 1374 | 1229 |
| jsonschema2pojo-core | 1896 | 276 | 282 | 282 | 282 | 282 | 462 | 604 | 604 | 604 |
| maven-core-3.8.1 | 4072 | 23 | 23 | 23 | 23 | 23 | 31 | 39 | 39 | 39 |
| microbenchmark | 471 |108 | 123 | 123 | 123 | 123 | 132 | 132 | 132 | 132 |
| mybatis-3.5.6 | 19232 |575 | 577 | 577 | 577 | 0 | 644 | 1345 | 1345 | 0 |
| quartz-core-2.3.1 | 3436 | 21 | 21 | 21 | 21 | 21 | 23 | 31 | 31 | 31 |
| vraptor-core-3.5.5 | 5868 | 942 | 963 | 962 | 962 | 0 | 1301 | 1630 | 1627 | 0 |



## LOC and Runtime Information for benchmarks

```
LOC - SLOCCOUNT command


Soot Runtime : built-in timer output;
              locate "Soot has run MockAnalysisMainTransformer for XXX ms in the output."
Runtime Doop : from the corresponding log file
```
| Benchmark | LOC Total | LOC (Main) | LOC (Test) |
| --- | --: | --: | --: |
| bootique-2.0.B1-bootique | 15530 | 6935 | 8595 |
| commons-collections4-4.4 | 65273 | 28955 | 36318 |
| flink-core-1.13.0-rc1 | 117310 | 67580 | 49730 |
| jsonschema2pojo-core-1.1.1 | 8233 | 5348 | 2885 |
| maven-core-3.8.1 | 38866 | 27762 | 11104 |
| microbenchmark | 954 | 71 | 883 |
| mybatis-3.5.6 | 68268 | 21934 | 46334 |
| quartz-core-2.3.1 | 35355 | 26932 | 8423 |
| vraptor-core-3.5.5 | 34244 | 14111 | 20133 |
| Total | 383638 | 199628 | 184405 |

| Benchmark | Soot Runtime on Annotated Transformer (s) | Soot Runtime on Pre Transformer (s) | Soot Runtime on Main Transformer (s) | Total Soot Runtime on all three Transformers (s) | Doop NORMAL mock analysis (s) | Doop Intra-proc mock analysis only (s) | Doop Total Runtime - NORMAL (s) | Doop Total Runtime - NO_INTERPROC (s) |
| --- | --: | --: | --: | --: | --: | --: | --: | --: |
| bootique-2.0.B1-bootique | 0.096 | 0.012 | 0.168 | 0.276 | 315 | 86 | 2730 | 2501 |
| commons-collections4-4.4 | 0.053 | 0.019 | 0.314 | 0.386 | 51 | 53 | 453 | 455 |
| flink-core-1.13.0-rc1 | 0.098 | 0.019 | 0.298 | 0.415 | 116 | 194 | 1387 | 1465 |
| jsonschema2pojo-core-1.1.1 | 0.093 | 0.015 | 0.174 | 0.282 | 153 | 180 | 756 | 783 |
| maven-core-3.8.1 | 0.071 | 0.014 | 0.191 | 0.276 | 111 | 126 | 511 | 526 |
| microbenchmark | 0.034 | 0.014 | 0.082 | 0.13 | 25 | 24 | 193 | 192 |
| mybatis-3.5.6 | 0.135 | 0.064 | 0.463 | 0.662 | 504 | 344 | 3800 | 3640 |
| quartz-core-2.3.1 | 0.061 | 0.020 | 0.150 | 0.231 | 92 | 40 | 779 | 727 |
| vraptor-core-3.5.5 | 0.125 | 0.045 | 0.285 | 0.455 | 133 | 251 | 1386 | 1504 |
| Total | 0.766 | 0.222 | 2.125 | 3.123 | 1500 | 1298 | TBD | TBD |

## Field Mock Objects
```
Output from Soot's Mock Analysis

Locate
"Total Number of Annotated Mocks in the benchmark"
"Total Number of Mocks defined in default init<> in the benchmark"
"Total Number of Mocks defined in @Before in the benchmark"
in the Soot output.

```

| Benchmark | Total Number of Annotated Field Mock Objects | Total Number of Field Mock Objects defined in Default Init | Total Number of Field Mock Objects defined in Before Methods |
| --- | --: | --: | --: |
| bootique-2.0.B1-bootique | 0 | 0 | 8 |
| commons-collections4-4.4 | 0 | 0 | 0 |
| flink-core-1.13.0-rc1 | 0 | 0 | 0 |
| jsonschema2pojo-core-1.1.1 | 26 | 126 | 0 |
| maven-core-3.8.1 | 7 | 0 | 1 |
| microbenchmark | 2 | 0 | 29 |
| mybatis-3.5.6 | 41 | 0 | 0 |
| quartz-core-2.3.1 | 0 | 0 | 0 |
| vraptor-core-3.5.5 | 263 | 2 | 45 |
| Total | 339 | 128 | 83 |

## Mock Analysis table (May Analysis, Intraprocedural)

```
Output from Soot's Mock Analysis; manually compiled into table
(results need to be updated with updated benchmarks and program)

Locate
"Total Number of Test/Before/After Methods"
"Total Number of Test/Before/After Methods with May Mock"
"Total Number of Test/Before/After Methods with ArrayMock"
"Total Number of Test/Before/After Methods with Collection"
"Total Number of Helper Methods"
"Total Number of Helper Methods with MayMock"
"Total Number of Helper Methods with ArrayMock"
"Total Number of Helper Methods with CollectionMock"
in the output.


```

| Benchmark | Total Number of Test/Before/After Methods Invoked | Number of Test/Before/After Methods with MayMock (Intra) | Number of Test/Before/After Methods with ArrayMock (Intra) | Number of Test/Before/After Methods with CollectionMock (Intra) | Total Number of Helper Methods | Total Number of Helper Methods with MayMock |  Total Number of Helper Methods with ArrayMock | Total Number of Helper Methods with CollectionMock |
| --- | --: | --: | --: | --: | --: | --: | --: | --: |
| bootique-2.0.B1-bootique | 420 | 32 | 7 | 0 | 223 | 6 | 0 | 0 |
| commons-collections4-4.4 | 1152 | 3 | 1 | 1 | 1096 | 2 | 2 | 0 |
| flink-core-1.13.0-rc1 | 1091 | 4 | 0 | 0 | 406 | 0 | 0 | 0 |
| jsonschema2pojo-core-1.1.1 | 145 | 76 | 1 | 0 | 54 | 16 | 0 | 0 |
| maven-core-3.8.1 | 337 | 24 | 0 | 0 | 125 | 2 | 0 | 0 |
| microbenchmark | 59 | 43 | 7 | 25 | 19 | 2 | 1 | 0 |
| mybatis-3.5.6 | 1769 | 330 | 3 | 0 | 599 | 4 | 0 | 0 |
| quartz-core-2.3.1 | 218 | 7 | 0 | 0 | 103 | 1 | 0 | 0 |
| vraptor-core-3.5.5 | 1119 | 565 | 15 | 0 | 229 | 12 | 0 | 0 |
| Total | 6310 | 1084 | 34 | 26 | 2854 | 45 | 3 | 0 |


## Field Mutation Data (Appendix)
```
Output from

./bin/soot-scripts/runall_MutatedFieldAnalysis.sh

The output would be in the format of following:

======================================
Benchmark 	 Total # of Fields Mutated in Test Cases / Total # of Fields
jsonschema2pojo_core_1.1.1	 0 / 228
```
| Benchmark |  Total # of Fields Mutated in Test Cases / Total # of Fields |
| --- | --: |
| bootique-2.0.B1-bootique | 0 / 271 |
| commons-collections4-4.4 | 3 / 697 |
| flink-core-1.13.0-rc1 | 8 / 2675 |
| jsonschema2pojo-core-1.1.1 | 0 / 228 |
| maven-core-3.8.1 | 0 / 765 |
| microbenchmark | 5 / 32 |
| mybatis-3.5.6 | 0 / 2618 |
| quartz-core-2.3.1 | 2 / 878 |
| vraptor-core-3.5.5 | 10 / 1193 |
| Total | 29 / 9352 |

## Manual Inspection on microbenchmark  (Intraprocedural)

| Benchmark | Number of Test/Before/After Methods with MayMock | Number of Test/Before/After Methods with ArrayMock | Number of Test/Before/After Methods with CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --: | --: | --: | --: | --: |
| microbenchmark | 23 | 5 | 4 | 47 | 5 |

For DirtyTest:

| Test Method | MayMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --: | --: | --: | --: | --: |
| init | 1 | 0 | 0 | 1 | 0 |
| testSingleEmployeeFieldArrayNomock | 0 | 0 | 0 | 0 | 0 |
| Total | 1 | 0 | 0 | 1 | 0 |

For PayRollAnnotationMockTest:

| Test Method | MayMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --: | --: | --: | --: | --: |
| init | 1 | 0 | 0 | 1 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 | 0 | 0 |
| testSingleEmployee | 0 | 0 | 0 | 0 | 0 |
| testEmployeeIsPaid | 1 | 0 | 0 | 1 | 0 |
| testBankService | 1 | 0 | 0 | 1 | 0 |
| Total | 4 | 1 | 0 | 3 | 0 |


For PayRollMockTest:

| Test Method | MayMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --: | --: | --: | --: | --: |
| init | 1 | 0 | 0 | 1 | 0 |
| testNoEmployees | 0 | 0 | 0 | 0 | 0 |
| testNoEmployeesIntra | 1 | 0 | 0 | 1 | 0 |
| testAddAll | 1 | 0 | 1 | 1 | 0 |
| testSingleEmployee | 0 | 0 | 0 | 0 | 0 |
| testSingleEmployeeMock | 1 (Inter) | 0 | 0 | 1 | 1 |
| testEmployeeIsPaid | 1 | 0 | 0 | 1 | 0 |
| testInteractionOrder | 1 | 0 | 0 | 2 | 0 |
| Total | 6 | 0 | 1 | 7 | 1 |

For PayRollArrayMockTest:

| Test Method | MayMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --: | --: | --: | --: | --: |
| init | 1 | 1 | 0 | 1 | 0 |
| testSingleEmployee | 0 | 0 | 0 | 0 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 | 0 | 0 |
| testSingleEmployeeFieldArrayMock | 1 (Field) | 0 | 0 | 2 | 0 |
| testSingleEmployeeLocalArrayMock | 1 | 0 | 0 | 2 | 0 |
| testAllEmployeesArePaidArrayIntra | 1 | 1 | 0 | 6 | 0 |
| testAllEmployeesArePaidArray | 1 | 1 (Inter) | 0 | 6 | 4 |
| Total | 6 | 4 | 0 | 17 | 4 |

For PayRollArrayNoMockTest:

| Test Method | MayMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --: | --: | --: | --: | --: |
| init | 1 | 0 | 0 | 1 | 0 |
| testNoEmployees | 0 | 0 | 0 | 0 | 0 |
| testSingleEmployeeFieldArrayNomock | 0 | 0 | 0 | 0 | 0 |
| testSingleEmployeeLocalArrayNomock | 0 | 0 | 0 | 0 | 0 |
| Total | 1 | 0 | 0 | 1 | 0 |


For PayRollMultipleEmployeeTest:

| Test Method | MayMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --: | --: | --: | --: | --: |
| init | 1 | 0 | 1 | 1 | 0 |
| testAllEmployeesArePaid1 | 1 | 0 | 0 | 5 (field) | 0 |
| testAllEmployeesArePaid2 | 1 | 0 | 1 | 6 (field) | 0 |
| Total | 3 | 0 | 2 | 12 | 0 |


For PayRollMultipleEmployee2Test:

| Test Method | MayMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --: | --: | --: | --: | --: |
| init | 1 | 0 | 1 | 1 | 0 |
| testAllEmployeesArePaid1 | 1 | 0 | 0 | 5 (field) | 0 |
| Total | 2 | 0 | 1 | 6 | 0 |
