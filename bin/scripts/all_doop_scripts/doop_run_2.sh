# doop runs for quartz
for n in NORMAL NO_INTERPROC; do
  ./doop -a context-insensitive -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/target/quartz-core-2.3.1.jar -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/target/quartz-core-2.3.1-tests.jar -i $HOME/Benchmarks/quartz-quartz-2.3.1-patched/quartz-core/mvn_dependencies --id quartz-core-mock-counts-$n --souffle-jobs 32 --main org.quartz.RootDriver --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/quartz-core-results/quartz-core-$n.log
  ./count.py --file results/quartz-core-2.3.1/context-insensitive/java_8/quartz-core-mock-counts-$n/isMockInvocation.csv &> $HOME/results/quartz-core-results/current-counts-$n
done


# doop runs for maven-core
for n in NORMAL NO_INTERPROC; do
  ./doop -a context-insensitive -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/target/maven-core-3.8.1.jar -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/target/maven-core-3.8.1-tests.jar -i $HOME/Benchmarks/maven-maven-3.8.1/maven-core/mvn_dependencies --id maven-core-mock-counts-$n --souffle-jobs 32 --main org.apache.maven.RootDriver --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/maven-core-results/maven-core-$n.log
  ./count.py --file results/maven-core-3.8.1/context-insensitive/java_8/maven-core-mock-counts-$n/isMockInvocation.csv &> $HOME/results/maven-core-results/current-counts-$n
done


# doop runs for microbenchmark
for n in NORMAL NO_INTERPROC; do
  ./doop  -a context-insensitive -i $HOME/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT.jar -i $HOME/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT-tests.jar -i $HOME/Benchmarks/microbenchmark/mvn_dependencies --id microbenchmark-mock-counts-$n --souffle-jobs 32 --main ca.liang.RootDriver --define-cpp-macro $n --extra-logic souffle-logic/analyses/mocks/mocks.dl &> $HOME/results/microbenchmark-results/microbenchmark-$n.log
  ./count.py --file results/payroll-test-0.0.1-SNAPSHOT/context-insensitive/java_8/microbenchmark-mock-counts-$n/isMockInvocation.csv &> $HOME/results/microbenchmark-results/current-counts-$n
done
