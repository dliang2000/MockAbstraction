#!/bin/bash

# doop runs for vraptor

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="vraptor-vraptor-parent-3.5.5"
export EXTRA_BENCHMARK="/vraptor-core"
export JVM=java_8
export COMPILED_JAR_PREFIX="vraptor-3.5.5"
export MAIN_CLASS="br.com.caelum.vraptor.RootDriver"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/_doop_X.sh
