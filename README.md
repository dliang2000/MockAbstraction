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

| Benchmark | LOC Total | LOC (Main) | LOC (Test) | Soot Runtime (s) | doop Runtime - mock (s) | doop Runtime - mock-intraproc (s) |
| --- | --: | --: | --: | --: | --: | --: |
| bootique-2.0.B1-bootique | 15530 | 6935 | 8595 | TBD | 2291 | 2365 |
| commons-collections4-4.4 | 65273 | 28955 | 36318 | TBD | 414 | 428 |
| flink-core-1.13.0-rc1 | 117310 | 67580 | 49730 | TBD | TBD | TBD |
| jsonschema2pojo-core-1.1.1 | 8233 | 5348 | 2885 | TBD | 728 | 696 |
| maven-core-3.8.1 | 38866 | 27762 | 11104 | TBD | 464 | 497 |
| microbenchmark | 559 | 68 | 491 | TBD | TBD | TBD |
| mybatis-3.5.6 | 68268 | 21934 | 46334 | TBD | TBD | TBD |
| quartz-core-2.3.1 | 35355 | 26932 | 8423 | TBD | 627 | 635 |
| vraptor-core-3.5.5 | 34244 | 14111 | 20133 | TBD | TBD | TBD |
| Total | 383638 | 199625 | 184013 | TBD | TBD | TBD |


## Field Mutation Data
| Benchmark |  Total # of Fields Mutated in Test Cases / Total # of Fields |
| --- | --: |
| bootique-2.0.B1-bootique | 0 / 271 |
| commons-collections4-4.4 | 3 / 697 |
| flink-core-1.13.0-rc1 | 8 / 2675 |
| jsonschema2pojo-core-1.1.1 | 0 / 228 |
| maven-core-3.8.1 | 0 / 765 |
| microbenchmark | 6 / 27 |
| mybatis-3.5.6 | 0 / 2618 |
| quartz-core-2.3.1 | 2 / 878 |
| vraptor-core-3.5.5 | 10 / 1193 |
| Total | 29 / 9352 |


## Mock Analysis table (May Analysis, Intraprocedural)
| Benchmark | Total Number of Test/Before/After Methods Invoked | Number of Test/Before/After Methods with MayMock (Intra) | Number of Test/Before/After Methods with ArrayMock (Intra) | Number of Test/Before/After Methods with CollectionMock (Intra) |
| --- | --: | --: | --: | --: |
| bootique-2.0.B1-bootique | 420 | 27 | 3 | 0 |
| commons-collections4-4.4 | 1152 | 3 | 1 | 0 |
| flink-core-1.13.0-rc1 | 1091 | 4 | 0 | 0 |
| jsonschema2pojo-core-1.1.1 | 145 | 48 | 1 | 0 |
| maven-core-3.8.1 | 337 | 15 | 0 | 0 |
| microbenchmark | 30 | 21 | 5 | 4 |
| mybatis-3.5.6 | 1769 | 330 | 3 | 1 |
| quartz-core-2.3.1 | 218 | 7 | 0 | 0 |
| vraptor-core-3.5.5 | 1120 | 526 | 15 | 12 |
| Total | 6282 | 981 | 28 | 17 |


## Mock Analysis - Analyzing InvokeExpr results (May Analysis, Intraprocedural)
| Benchmark | Total Number of Invocations | Number of Invocations on Mocks |
| --- | --: | --: |
| bootique-2.0.B1-bootique | 2923 | 82 |
| commons-collections-4.3 | 10913 | 13 |
| flink-core-1.13.0-rc1 | 10079 | 40 |
| jsonschema2pojo-core-1.1.1 | 1730 | 217 |
| maven-core-3.8.1 | 3367 | 21 |
| microbenchmark | 207 | 21 |
| mybatis-3.5.6 | 17798 | 569 |
| quartz-core-2.3.1 | 3217 | 21 |
| vraptor-core-3.5.51 | 5529 | 827 |
| Total | 55763 | 1811 |


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
