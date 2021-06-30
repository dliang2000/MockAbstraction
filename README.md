# MockAnalysis

This repository focuses on analyzing for mock objects created and used in unit test cases. The tool analyzes the mock objects through def-use chain and forward data flow analysis.

## Instructions

### Driver class generation

Copying config.sh.template to config.sh with necessary customizations of the path.

Run the following:

```console
./bin/scripts/BENCHMARK/driver_generator_BENCHMARK.sh
```

or if you want to generate driver classes for all benchmarks:

```console
./runall_driver.sh
```

### Mock Analysis:

Make sure the driver classes are generated before running Mock Analysis.

Run the following:

```console
./bin/scripts/BENCHMARK/MockFlowAnalysis_BENCHMARK.sh
```

or if you want to run Mock Analysis for all benchmarks:

```console
./runall_MockAnalysis.sh
```

### Mutated Field Analysis:

Make sure the driver classes are generated before running Mutated Field Analysis.

Run the following:

```console
./bin/scripts/BENCHMARK/MutatedFieldAnalysis_BENCHMARK.sh
```

or if you want to run Mock Analysis for all benchmarks:

```console
./runall_MutatedFieldAnalysis.sh
```

## LOC and Runtime Information for benchmarks

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
| bootique-2.0.B1-bootique | 0.061 | 0.007 | 0.225 | 0.293 | 315 | 86 | 2730 | 2501 |
| commons-collections4-4.4 | 0.052 | 0.012 | 0.281 | 0.345 | 51 | 53 | 453 | 455 |
| flink-core-1.13.0-rc1 | 0.091 | 0.008 | 0.259 | 0.358 | 116 | 194 | 1387 | 1465 |
| jsonschema2pojo-core-1.1.1 | 0.150 | 0.005 | 0.127 | 0.282 | 153 | 180 | 756 | 783 |
| maven-core-3.8.1 | 0.060 | 0.006 | 0.126 | 0.192 | 111 | 126 | 511 | 526 |
| microbenchmark | 0.036 | 0.0010 | 0.080 | 0.126 | 25 | 24 | 193 | 192 |
| mybatis-3.5.6 | 0.094 | 0.040 | 0.390 | 0.524 | 504 | 344 | 3800 | 3640 |
| quartz-core-2.3.1 | 0.087 | 0.012 | 0.116 | 0.215 | 92 | 40 | 779 | 727 |
| vraptor-core-3.5.5 | 0.087 | 0.027 | 0.226 | 0.340 | 133 | 251 | 1386 | 1504 |
| Total | 0.718 | 0.127 | 1.830 | 2.675 | 1500 | 1298 | TBD | TBD |


Doop NORMAL mock analysis (s) : Runtime of (regular doop run + extra-logic on NORMAL mock analysis) MINUS Runtime of (regular doop run)

Doop Intra-proc mock analysis only (s) : Runtime of (regular doop run + extra-logic on NO_INTERPROC mock analysis) MINUS Runtime of (regular doop run)


## Field Mutation Data
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

## Mock Analysis table (May Analysis, Intraprocedural)
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


## Mock Analysis - Analyzing InvokeExpr results (May Analysis, Intraprocedural)
| Benchmark | Total Number of Invocations | Number of Invocations on Mocks (Soot) | Number of Invocations on Mocks (Doop) |
| --- | --: | --: | --: |
| bootique-2.0.B1-bootique | 3366 | 99 | 99 |
| commons-collections4-4.4 | 12753 | 11 | 3 |
| flink-core-1.13.0-rc1 | 11923 | 40 | 40 |
| jsonschema2pojo-core-1.1.1 | 1896 | 276 | 282 |
| maven-core-3.8.1 | 4072 | 23 | 23 |
| microbenchmark | 471 | 108 | 123 |
| mybatis-3.5.6 | 19232 | 575 | 577 |
| quartz-core-2.3.1 | 3436 | 21 | 21 |
| vraptor-core-3.5.51 | 5868 | 942 | 962 |
| Total | 63017 | 2095 | 2125 |


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
