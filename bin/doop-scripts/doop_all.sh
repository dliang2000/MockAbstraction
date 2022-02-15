#!/bin/bash

# this script has to be invoked from the doop directory
# be sure to first 1) copy the .dl files from MockAbstraction/doop to souffle-logic/analyses/mocks
# and 2) run the driver-generator script (e.g. found in bin/scripts/$BENCHMARK)
# also make sure there is a config.sh in the doop directory where you're running it from

# sample contents of config.sh:
#MACHINE_SPECIFIC_PATH="$HOME/hacking/MockAbstraction"
#JCOMMANDER_JAR="$MACHINE_SPECIFIC_PATH/jcommand_jar/jcommander-1.81.jar"

if ! [ -f "config.sh" ]; then
    echo "must create config.sh to proceed; see config.sh.template in MockAbstraction dir"
    exit 1
fi

. ./config.sh

# truncate benchmark names to first dash
ALL_BENCHMARKS_TRUNCATED=bootique:commons_collections4:flink:jsonschema2pojo:maven:microbenchmark:mybatis:quartz:vraptor

for b in ${ALL_BENCHMARKS_TRUNCATED//:/ }; do
    if ! $MACHINE_SPECIFIC_PATH/bin/doop-scripts/doop-all-scripts/doop_all_$b.sh; then
      echo "failed"
    fi
done

