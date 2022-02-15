#!/bin/bash

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="jsonschema2pojo-1.1.1"
export EXTRA_BENCHMARK="/jsonschema2pojo-core"
export JVM=java_8
export COMPILED_JAR_PREFIX=jsonschema2pojo-core-1.1.1
export MAIN_CLASS="org.jsonschema2pojo.RootDriver"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/_doop_all.sh
