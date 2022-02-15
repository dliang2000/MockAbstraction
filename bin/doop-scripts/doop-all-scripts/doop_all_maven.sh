#!/bin/bash

# doop runs for maven

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="maven-maven-3.8.1"
export EXTRA_BENCHMARK="/maven-core"
export JVM=java_8
export COMPILED_JAR_PREFIX="maven-core-3.8.1"
export MAIN_CLASS="org.apache.maven.RootDriver"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/_doop_all.sh

