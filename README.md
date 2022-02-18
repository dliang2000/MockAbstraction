# MockAnalysis

This repository focuses on analyzing for mock objects created and used in unit test cases. There are two analyses: a Soot-based intraprocedural dataflow analysis and a Doop-based declarative analysis.

## Instructions

### Driver class generation

To analyze test cases, we must first produce Driver files that invoke those test cases.

All of our scripts use config.sh to indicate where things are.
Copy config.sh.template to config.sh and customization the paths as necessary.

To generate drivers for all benchmarks, use:

```console
./bin/prepare-benchmarks.sh
```

Two of our benchmarks run (and hence can be mvn package'd) under JDK 8 and not JDK 11. We don't know if they
run on any versions in between.

You could also generate drivers for one benchmark at a time:

```console
./bin/prepare-scripts/BENCHMARK/driver_generator_BENCHMARK.sh
```

However, the `prepare-benchmarks.sh` script takes care of unpacking flink and mybatis, and applies patches to flink to disable style checks.

### Intraprocedural Mock Analysis (Soot):

Make sure the driver classes are generated before running Mock Analysis.

Run the following:

```console
./bin/soot-scripts/BENCHMARK/MockFlowAnalysis_Intra_BENCHMARK.sh
```

or if you want to run intraprocedural Mock Analysis for all benchmarks:

```console
./bin/soot-scripts/runall_MockAnalysis_Intra.sh
```

### Doop

You can run all of the Doop variants on all of the benchmarks with:
```console
./bin/doop-scripts/doop_all.sh
```

However, you must run it from the main directory of a doop install and you must follow
the instructions in the comment at the top of `doop_all.sh`. This script puts results
in the `results/` directory of your MockAbstraction tree.

As always, there are scripts for running one benchmark at a time. You can figure those out.

### Doop Mock counts data processing

After doop finished running for benchmarks, you may run the following to process mock counts:

```console
./bin/python-scripts/runall_process_counts.sh > CSV_FILE
```


### Mutated Field Analysis (Appendix):

Our paper describes a preliminary analysis to detect field mutations.

Make sure the driver classes are generated before running Mutated Field Analysis.

Run the following:

```console
./bin/soot-scripts/BENCHMARK/MutatedFieldAnalysis_BENCHMARK.sh
```

or if you want to run Mutated Field Analysis for all benchmarks:

```console
./bin/soot-scripts/runall_MutatedFieldAnalysis.sh
```
