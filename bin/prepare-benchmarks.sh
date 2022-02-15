#!/bin/bash
if ! [ -f "config.sh" ]; then
    echo "must create config.sh to proceed; see config.sh.template"
    exit 1
fi

. ./config.sh

PACKED_BENCHMARKS=flink-release-1.13.0-rc1.tar.xz:mybatis-3-mybatis-3.5.6.tar.xz
ALL_BENCHMARKS=bootique-2.0.B1:commons-collections4-4.4:flink-release-1.13.0-rc1:jsonschema2pojo-1.1.1:maven-maven-3.8.1:microbenchmark:mybatis-3-mybatis-3.5.6:quartz-quartz-2.3.1-patched:vraptor-vraptor-parent-3.5.5

(
cd Benchmarks;
for b in ${PACKED_BENCHMARKS//:/ }; do
  tar xJvf $b
done;
cp benchmark-info/flink-release-1.13.0-rc1-pom.xml flink-release-1.13.0-rc1/pom.xml
cp benchmark-info/flink-release-1.13.0-rc1--flink-core-pom.xml flink-release-1.13.0-rc1/flink-core/pom.xml
)

for b in ${ALL_BENCHMARKS//:/ }; do
  cp Benchmarks/benchmark-info/$b Benchmarks/$b/benchmark_info.config
done

for b in ${ALL_BENCHMARKS//:/ }; do
  if ! bin/prepare-scripts/$b/driver_generator.sh; then
    echo "driver generator failed for $b"
    exit 1
  fi
done
