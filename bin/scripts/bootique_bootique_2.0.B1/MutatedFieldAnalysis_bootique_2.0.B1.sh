#!/bin/bash
#under msp everything should be identical on all computers
source ./config.sh
echo $MACHINE_SPECIFIC_PATH

PACKAGE="io.bootique"
SOOT_JAR="$MACHINE_SPECIFIC_PATH/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/target/classes":$JCOMMANDER_JAR
CC_CLASS="ca.uwaterloo.liang.FieldMutationAnalysisMain"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/Benchmarks/bootique-2.0.B1"
TARGET_PATH="bootique/target/classes"
TARGET_TEST_PATH="bootique/target/test-classes"
BENCHMARK="bootique_bootique_2.0.B1"
DRIVER_PATH="io.bootique.RootDriver"
OUTPUT_PATH="$MACHINE_SPECIFIC_PATH/analysis_output/MockAnalysis"

MVN_DEPENDENCY_PATH="$BENCHMARK_PATH/bootique/mvn_dependencies"

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

java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS --benchmark $BENCHMARK --driver $DRIVER_PATH --target $BENCHMARK_PATH/$TARGET_PATH --target-tests $BENCHMARK_PATH/$TARGET_TEST_PATH --mvn-dependencies $jars`cat benchmark_class_path`:$JAR_PATH -v
#rm -rf "sootOutput/"
