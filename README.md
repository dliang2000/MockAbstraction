# MockAnalysis

This repository focuses on analyzing for mock objects created and used in unit test cases. The tool analyzes the mock objects through def-use chain and forward data flow analysis.

## Field Mutation Data
| Benchmark |  Total # of Fields Mutated in Test Cases / Total # of Fields |
| --- | --- |
| bootique-2.0.B1-bootique | 0 / 271 |
| commons-collections4-4.4 | 1 / 697 |
| jsonschema2pojo-core-1.1.1 | 0 / 228 |
| microbenchmark | 6 / 27 |
| mybatis_3.5.6 | 0 / 2618 |
| quartz-core | 2 / 878 |


## Mock Analysis table
| Benchmark | Total Number of Test/Before/After Methods | Number of Test/Before/After Methods with MustMock (Intra) | Number of Test/Before/After Methods with ArrayMock (Intra) | Number of Test/Before/After Methods with CollectionMock (Intra) |
| --- | --- | --- | --- | --- |
| bootique-2.0.B1-bootique | 420 | 27 | 3 | 0 |
| commons-collections4-4.4 | 24946 | 3 | 1 | 0 |
| jsonschema2pojo-core-1.1.1 | 110 | 21 | 1 | 0 |
| microbenchmark | 25 | 16 | 5 | 2 |
| mybatis_3.5.6 | 1675 | 330 | 3 | 1 |
| quartz-core | 305 | 7 | 0 | 0 |

## Manual Inspection on microbenchmark  (Intraprocedural)

| Benchmark | Number of Test/Before/After Methods with MustMock | Number of Test/Before/After Methods with ArrayMock | Number of Test/Before/After Methods with CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --- | --- | --- | --- | --- |
| microbenchmark | 18 | 5 | 2 | 39 | 5 |

For PayRollMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --- | --- | --- | --- | --- |
| init | 1 | 0 | 0 | 1 | 0 |
| testNoEmployees | 0 | 0 | 0 | 0 | 0 |
| testNoEmployeesIntra | 1 | 0 | 0 | 1 | 0 |
| testSingleEmployee | 0 | 0 | 0 | 0 | 0 |
| testSingleEmployeeMock | 1 (Inter) | 0 | 0 | 1 | 1 |
| testEmployeeIsPaid | 1 | 0 | 0 | 1 | 0 |
| testAllEmployeesArePaid1 | 1 | 0 | 1 | 6 | 0 |
| testAllEmployeesArePaid2 | 1 | 0 | 1 | 6 | 0 |
| testInteractionOrder | 1 | 0 | 0 | 2 | 0 |
| Total | 7 | 0 | 2 | 18 | 1 |

For PayRollArrayMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --- | --- | --- | --- | --- |
| init | 1 | 1 | 0 | 1 | 0 |
| testSingleEmployee | 0 | 0 | 0 | 0 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 | 0 | 0 |
| testSingleEmployeeFieldArrayMock | 1 (Inter) | 0 | 0 | 2 | 0 |
| testSingleEmployeeLocalArrayMock | 1 | 0 | 0 | 2 | 0 |
| testAllEmployeesArePaidArrayIntra | 1 | 1 | 0 | 6 | 0 |
| testAllEmployeesArePaidArray | 1 | 1 | 0 | 6 | 4 |
| Total | 6 | 4 | 0 | 17 | 4 |

For PayRollArrayNoMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --- | --- | --- | --- | --- |
| init | 1 | 0 | 0 | 1 | 0 |
| testNoEmployees | 0 | 0 | 0 | 0 | 0 |
| testSingleEmployeeFieldArrayNomock | 0 | 0 | 0 | 0 | 0 |
| testSingleEmployeeLocalArrayNomock | 0 | 0 | 0 | 0 | 0 |
| Total | 1 | 0 | 0 | 1 | 0 |

For PayRollAnnotationMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock | Total Mock Calls | Total Mock Calls (Inter-procedural) |
| --- | --- | --- | --- | --- | --- |
| init | 1 | 0 | 0 | 0 | 0 |
| testNoEmployees | 0 | 0 | 0 | 0 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 | 0 | 0 |
| testSingleEmployee | 1 | 0 | 0 | 1 | 0 |
| testEmployeeIsPaid | 1 | 0 | 0 | 2 | 0 |
| Total | 4 | 1 | 0 | 3 | 0 |

## Mock Analysis - Analyzing InvokeExpr results
| Benchmark | Total Number of Invocations | Number of Invocations on Mocks |
| --- | --- | --- |
| bootique-2.0.B1-bootique | 2923 | 82 |
| commons-collections-4.3 | 3001 | 13 |
| jsonschema2pojo-core-1.1.1 | 1262 | 39 |
| microbenchmark | 166 | 13 |
| mybatis_3.5.6 | 17798 | 569 |
| quartz-core | 3206 | 21 |
