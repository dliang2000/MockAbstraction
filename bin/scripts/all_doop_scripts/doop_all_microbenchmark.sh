#!/bin/bash

# this script has to be invoked from the doop directory
# be sure to first 1) copy the .dl files from MockAbstraction/doop to souffle-logic/analyses/mocks
# and 2) run the driver-generator script (e.g. found in bin/scripts/$BENCHMARK)

# sample contents of config.sh:
#MACHINE_SPECIFIC_PATH="$HOME/hacking/MockAbstraction"
#JCOMMANDER_JAR="$MACHINE_SPECIFIC_PATH/jcommand_jar/jcommander-1.81.jar"

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="microbenchmark"
export JVM=java_8
export COMPILED_JAR_PREFIX="payroll-test-0.0.1-SNAPSHOT"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/doop_all.sh
