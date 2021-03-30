#!/bin/bash
#under msp everything should be identical on all computers
source ../../../config.sh
echo $MACHINE_SPECIFIC_PATH

PACKAGE="org.apache.commons.collections4"
SOOT_JAR="$MACHINE_SPECIFIC_PATH/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/target/classes"
CC_CLASS="ca.uwaterloo.liang.MockRunner"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/Benchmarks/commons-collections-collections-4.3"
TARGET_PATH="target/classes"
TARGET_TEST_PATH="target/test-classes"
BENCHMARK="commons_collections_4.3"
DRIVER_PATH="org.apache.commons.collections4.Driver"
OUTPUT_PATH="$MACHINE_SPECIFIC_PATH/analysis_output/MockAnalysis"

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
  mvn clean test
fi

java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $DRIVER_PATH $BENCHMARK_PATH/$TARGET_PATH $BENCHMARK_PATH/$TARGET_TEST_PATH $jars`cat benchmark_class_path`:$JAR_PATH $BENCHMARK $OUTPUT_PATH
#rm -rf "sootOutput/"
