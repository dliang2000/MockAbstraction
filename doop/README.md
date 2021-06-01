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

# Notes on current doop implementation

As of the time of writing, it's intraprocedural, but does not make conservative approximations for interprocedural results; i.e. it assumes that calls never return mock objects. Fields are marked as mock-containing though.

