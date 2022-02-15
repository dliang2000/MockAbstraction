#!/bin/bash

# doop runs for flink

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="flink-release-1.13.0-rc1"
export EXTRA_BENCHMARK="/flink-core"
export JVM=java_8
export COMPILED_JAR_PREFIX="flink-core-1.13.0"
export MAIN_CLASS="org.apache.flink.RootDriver"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/_doop_X.sh
