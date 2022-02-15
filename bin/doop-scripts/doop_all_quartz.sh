#!/bin/bash

# doop runs for quartz

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="quartz-quartz-2.3.1-patched"
export EXTRA_BENCHMARK="/quartz-core"
export JVM=java_8
export COMPILED_JAR_PREFIX="quartz-core-2.3.1"
export MAIN_CLASS="org.quartz.RootDriver"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/_doop_X.sh
