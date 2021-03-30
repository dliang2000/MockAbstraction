#!/bin/bash
#under msp everything should be identical on all computers
source ../../../config.sh
echo $MACHINE_SPECIFIC_PATH

SOOT_JAR="$MACHINE_SPECIFIC_PATH/soot_jar/soot-4.3.0-20210307.143351-83-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/target/classes"
CC_CLASS="ca.uwaterloo.liang.DriverGenerator"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/Benchmarks/commons-lang3-3.9-src-patched"
TEXT_PATH="benchmark_info.txt"

MVN_DEPENDENCY_PATH="$BENCHMARK_PATH/mvn_dependencies"

# add all the jar files needed for set_soot_classpath
for jar in $MVN_DEPENDENCY_PATH/*; do
  JAR_PATH=$JAR_PATH:$jar
done
echo $JAR_PATH

cd $BENCHMARK_PATH

# touch is_maven in the benchmark directory to indicate that a benchmark is mvn
if [ -a is_maven ]; then
  echo "it is a maven project"
  mvn clean test -Drat.skip=true
fi

java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TEXT_PATH
#rm -rf "sootOutput/"
