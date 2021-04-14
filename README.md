# MockAnalysis

This repository focuses on analyzing for mock objects created and used in unit test cases. The tool analyzes the mock objects through def-use chain and forward data flow analysis.

## Mock Analysis table
| Benchmark | Number of Test Methods with MustMock | Number of Test Methods with ArrayMock (Intra) | Number of Test Methods with CollectionMock |
| --- | --- | --- | --- |
| commons-collections-4.3 | 3 | 1 | 0 |
| microbenchmark | 13 | 4 | 0 |
