#!/bin/bash
#under msp everything should be identical on all computers
source ./config.sh
echo $MACHINE_SPECIFIC_PATH

SOOT_JAR="$MACHINE_SPECIFIC_PATH/soot_jar/sootclasses_j9-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/target/classes"
CC_CLASS="ca.uwaterloo.liang.RootDriverGenerator"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/Benchmarks/flink-release-1.13.0-rc1"
CORE="flink-core"
ARGS_PATH="benchmark_info.config"
/bin/sed "s|\$MACHINE_SPECIFIC_PATH|$MACHINE_SPECIFIC_PATH|g"< $BENCHMARK_PATH/$ARGS_PATH > $BENCHMARK_PATH/$ARGS_PATH.local

MVN_DEPENDENCY_PATH="$BENCHMARK_PATH/flink-core/mvn_dependencies"

# add all the jar files needed for set_soot_classpath
for jar in $MVN_DEPENDENCY_PATH/*; do
  JAR_PATH=$JAR_PATH:$jar
done
echo $JAR_PATH

mvn compile

cd $BENCHMARK_PATH/$CORE

# remove Driver and RootDriver classes if they exist
find . -name "Driver.java" -type f -delete
find . -name "RootDriver.java" -type f -delete

# touch is_maven in the benchmark directory to indicate that a benchmark is mvn
if [ -a is_maven ]; then
  echo "it is a maven project"
  mvn clean test
fi

cd ..

echo java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$ARGS_PATH.local
if ! java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$ARGS_PATH.local; then 
  echo "soot failed"
  exit 1
fi

# rm -rf "sootOutput/"

cd $BENCHMARK_PATH/$CORE
mvn package
