#!/bin/bash

# doop runs for mybatis

. ./config.sh
export MACHINE_SPECIFIC_PATH
export BENCHMARK="mybatis-3-mybatis-3.5.6"
export EXTRA_BENCHMARK=""
export JVM=java_8
export COMPILED_JAR_PREFIX="mybatis-3.5.6"
export MAIN_CLASS="org.apache.ibatis.RootDriver"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
$SCRIPT_DIR/_doop_X.sh
