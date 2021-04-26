# MockAnalysis

This repository focuses on analyzing for mock objects created and used in unit test cases. The tool analyzes the mock objects through def-use chain and forward data flow analysis.

## Mock Analysis table
| Benchmark | Total Number of Tests | Number of Test Methods with MustMock | Number of Test Methods with ArrayMock (Intra) | Number of Test Methods with CollectionMock |
| --- | --- | --- | --- | --- |
| commons-collections4-4.4 | 24946 | 3 | 1 | 0 |
| microbenchmark | 19 | 15 | 5 | 2 |
| mybatis_3.5.6 | 1675 | 330 | 3 | 1 |
| quartz-core | 305 | 7 | 0 | 0 |

## Manual Inspection on microbenchmark  (Intraprocedural)

| Benchmark | Number of Test Methods with MustMock | Number of Test Methods with ArrayMock (Intra) | Number of Test Methods with CollectionMock |
| --- | --- | --- | --- |
| microbenchmark | 15 | 5 | 2 |

For PayRollMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock |
| --- | --- | --- | --- |
| init | 1 | 0 | 0 |
| testNoEmployees | 0 | 0 | 0 |
| testNoEmployeesIntra | 1 | 0 | 0 |
| testSingleEmployee | 0 | 0 | 0 |
| testEmployeeIsPaid | 1 | 0 | 0 |
| testAllEmployeesArePaid1 | 1 | 0 | 1 |
| testAllEmployeesArePaid2 | 1 | 0 | 1 |
| testInteractionOrder | 1 | 0 | 0 |
| Total | 6 | 0 | 2 |

For PayRollArrayMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock |
| --- | --- | --- | --- |
| init | 1 | 1 | 0 |
| testNoEmployees | 0 | 0 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 |
| testSingleEmployeeFieldArrayNomock | 0 | 0 | 0 |
| testSingleEmployeeFieldArrayMock | 1 | 0 | 0 |
| testSingleEmployeeLocalArrayNomock | 0 | 0 | 0 |
| testSingleEmployeeLocalArrayMock | 1 | 0 | 0 |
| testAllEmployeesArePaidArrayIntra | 1 | 1 | 0 |
| testAllEmployeesArePaidArray | 1 | 0 | 0 |
| Total | 5 | 4 | 0 |

For PayRollAnnotationMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock |
| --- | --- | --- | --- |
| init | 1 | 0 | 0 |
| testNoEmployees | 0 | 0 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 |
| testSingleEmployee | 1 | 0 | 0 |
| testEmployeeIsPaid | 1 | 0 | 0 |
| Total | 4 | 1 | 0 |

## Mock Analysis - Analyzing InvokeExpr results
| Benchmark | Total Number of Invocations | Number of Invocations on Mocks |
| --- | --- | --- |
| commons-collections-4.3 | 3001 | 13 |
| microbenchmark | 160 | 12 |
| mybatis_3.5.6 | 17798 | 569 |
| quartz-core | 3206 | 21 |
