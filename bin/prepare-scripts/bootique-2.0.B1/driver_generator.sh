#!/bin/bash
#under msp everything should be identical on all computers
source ./config.sh
echo $MACHINE_SPECIFIC_PATH

SOOT_JAR="$MACHINE_SPECIFIC_PATH/soot_jar/sootclasses_j9-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/target/classes"
CC_CLASS="ca.uwaterloo.liang.RootDriverGenerator"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/Benchmarks/bootique-2.0.B1"
TEXT_PATH="benchmark_info.config"

MVN_DEPENDENCY_PATH="$BENCHMARK_PATH/bootique/mvn_dependencies"

# add all the jar files needed for set_soot_classpath
for jar in $MVN_DEPENDENCY_PATH/*; do
  JAR_PATH=$JAR_PATH:$jar
done
echo $JAR_PATH

mvn compile

cd $BENCHMARK_PATH

# remove Driver and RootDriver classes if they exist
find . -name "Driver.java" -type f -delete
find . -name "RootDriver.java" -type f -delete

# touch is_maven in the benchmark directory to indicate that a benchmark is mvn
if [ -a is_maven ]; then
  echo "it is a maven project"
  mvn clean test
fi

echo java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TEXT_PATH
if ! java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TEXT_PATH; then 
  echo "soot failed"
  exit 1
fi
# rm -rf "sootOutput/"

mvn package
