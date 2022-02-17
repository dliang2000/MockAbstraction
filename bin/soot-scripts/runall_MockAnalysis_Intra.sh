#!/bin/bash

. ./config.sh

# Run all the Mock Flow Analysis
ALL_BENCHMARKS_TRUNCATED=bootique:commons_collections4:flink:jsonschema2pojo:maven:microbenchmark:mybatis:quartz:vraptor

for b in ${ALL_BENCHMARKS_TRUNCATED//:/ }; do
    if ! $MACHINE_SPECIFIC_PATH/bin/soot-scripts/soot-all-scripts/mock_intra_$b.sh; then
      echo "failed"
    fi
done
