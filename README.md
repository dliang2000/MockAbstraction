# MockAnalysis

This repository focuses on analyzing for mock objects created and used in unit test cases. The tool analyzes the mock objects through def-use chain and forward data flow analysis.

## Mock Analysis table
| Benchmark | Number of Test Methods with MustMock | Number of Test Methods with ArrayMock (Intra) | Number of Test Methods with CollectionMock |
| --- | --- | --- | --- |
| commons-collections-4.3 | 3 | 1 | 0 |
| microbenchmark | 14 | 4 | 2 |
| mybatis_3.5.6 | 324 | 2 | 0 |
| quartz-core | 7 | 0 | 0 |

## Manual Inspection on microbenchmark  (Intraprocedural)

| Benchmark | Number of Test Methods with MustMock | Number of Test Methods with ArrayMock (Intra) | Number of Test Methods with CollectionMock |
| --- | --- | --- | --- |
| microbenchmark | 17 | 4 | 2 |

For PayRollTest:

| Test Method | MustMock | ArrayMock | CollectionMock |
| --- | --- | --- | --- |
| testNoEmployees | 0 | 0 | 0 |
| testNoEmployeesIntra | 1 | 0 | 0 |
| testSingleEmployee | 0 | 0 | 0 |
| testEmployeeIsPaid | 1 | 0 | 0 |
| testAllEmployeesArePaid | 1 | 0 | 0 |
| Total | 3 | 0 | 0 |

For PayRollMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock |
| --- | --- | --- | --- |
| testNoEmployees | 0 | 0 | 0 |
| testNoEmployeesIntra | 1 | 0 | 0 |
| testSingleEmployee | 0 | 0 | 0 |
| testEmployeeIsPaid | 0 | 0 | 0 |
| testAllEmployeesArePaid1 | 1 | 0 | 1 |
| testAllEmployeesArePaid2 | 1 | 0 | 1 |
| testInteractionOrder | 0 | 0 | 0 |
| Total | 3 | 0 | 2 |

For PayRollArrayTest:

| Test Method | MustMock | ArrayMock | CollectionMock |
| --- | --- | --- | --- |
| testNoEmployees | 0 | 0 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 |
| testSingleEmployee | 1 | 1 | 0 |
| testEmployeeIsPaid | 1 | 0 | 0 |
| testAllEmployeesArePaidArray | 1 | 0 | 0 |
| Total | 4 | 2 | 0 |

For PayRollArrayMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock |
| --- | --- | --- | --- |
| testNoEmployees | 0 | 0 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 |
| testSingleEmployee | 1 | 0 | 0 |
| testEmployeeIsPaid | 1 | 0 | 0 |
| testAllEmployeesArePaidArray | 1 | 0 | 0 |
| Total | 4 | 1 | 0 |

For PayRollAnnotationMockTest:

| Test Method | MustMock | ArrayMock | CollectionMock |
| --- | --- | --- | --- |
| testNoEmployees | 0 | 0 | 0 |
| testEmployeesPaidIntra | 1 | 1 | 0 |
| testSingleEmployee | 1 | 0 | 0 |
| testEmployeeIsPaid | 1 | 0 | 0 |
| Total | 3 | 1 | 0 |
