#!/bin/bash

# Run all the Mutated Field Analysis
./bin/soot-scripts/bootique-2.0.B1/MutatedFieldAnalysis_bootique_2.0.B1.sh

./bin/soot-scripts/commons-collections4-4.4/MutatedFieldAnalysis_commons_collections_4.4.sh

./bin/soot-scripts/jsonschema2pojo-1.1.1/MutatedFieldAnalysis_jsonschema2pojo_core_1.1.1.sh

./bin/soot-scripts/maven-maven-3.8.1/MutatedFieldAnalysis_maven_3.8.1.sh

./bin/soot-scripts/microbenchmark/MutatedFieldAnalysis_microbenchmark.sh

./bin/soot-scripts/mybatis-3-mybatis-3.5.6/MutatedFieldAnalysis_mybatis_3.sh

./bin/soot-scripts/quartz-quartz-2.3.1-patched/MutatedFieldAnalysis_quartz_2.3.1.sh

./bin/soot-scripts/vraptor-vraptor-parent-3.5.5/MutatedFieldAnalysis_vraptor_core_3.3.5.sh
