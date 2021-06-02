# Instructions on running doop

## Install souffle

* git clone git@github.com:patricklam/souffle.git
* cd souffle; ./configure --prefix=~/pkgs/souffle; make; make install
* export PATH=~/pkgs/souffle/bin (every time you log in, or add it to .profile)

## Install doop
* git clone https://bitbucket.org/yanniss/doop.git
* copy MockAbstraction/doop/mocks.dl to ~/doop/souffle-logic/analyses/mocks/mocks.dl

## Run doop
* command line:

```./doop -a context-insensitive -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT.jar -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT-tests.jar -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/mvn_dependencies/ --id context-insensitive-with-mocks --souffle-jobs 32 --main ca.liang.RootDriver --extra-logic souffle-logic/analyses/mocks/mocks.dl```

* run count.py to generate statistics from results in `last-analysis/`, you might want to redirect that to ~/MockAbstraction/doop/XXX-results

# TODO/Notes on current doop implementation

mocks.dl is interprocedural, mocks-intraproc.dl is intraprocedural (but does not make conservative assumptions, e.g. it assumes that mocks never come from callees)
if you specify --cache and you include MainClass("ca.liang.RootDriver") or whatever then it doesn't recompute facts. It will have to recompile the .dl when you change it.

* Also, Collection.addAll is not implemented yet (this should be easy).
* isMockInvocation only handles VirtualMethodInvocation; are there any other invocation types that are relevant? (not StaticMethodInvocation, but maybe SpecialMethodInvocation, DynamicMethodInvocation, SuperMethodInvocation?)
