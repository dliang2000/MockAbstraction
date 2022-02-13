#!/bin/bash

# doop runs for commons-collections4

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="commons-collections4-4.4"
export EXTRA_BENCHMARK=""
export JVM=java_8
export COMPILED_JAR_PREFIX="commons-collections4-4.4"
export MAIN_CLASS="org.apache.commons.collections4.RootDriver"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/_doop_all.sh
