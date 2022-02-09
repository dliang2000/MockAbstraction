# Instructions on running doop

## Install souffle

* git clone git@github.com:souffle-lang/souffle.git
* cd souffle; ./configure --prefix=~/pkgs/souffle; make; make install
* export PATH=~/pkgs/souffle/bin (every time you log in, or add it to .profile)
(oh no, souffle went cmake so that doesn't work anymore)

## Install doop
* git clone https://bitbucket.org/yanniss/doop.git
* copy MockAbstraction/doop/logic/*.dl to ..//doop/souffle-logic/analyses/mocks/

## Run doop
* command line:

```./doop -a context-insensitive -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT.jar -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/target/payroll-test-0.0.1-SNAPSHOT-tests.jar -i ~/hacking/MockAbstraction/Benchmarks/microbenchmark/mvn_dependencies/ --id context-insensitive-with-mocks --souffle-jobs 32 --main ca.liang.RootDriver --extra-logic souffle-logic/analyses/mocks/mocks.dl```

* run count.py to generate statistics from results in `last-analysis/`, you might want to redirect that to ~/MockAbstraction/doop/XXX-results

# TODO/Notes on current doop implementation

We generate a lot more output relations than we strictly speaking need. It's probably good to do 
that while we're still debugging, but longer-term, it may make the analysis run more slowly than 
it should. Relations that we probably don't need to output and that show up prominently in du 
-hs * | sort -h:

* InstanceFieldPointsTo, AssignLocal, Instruction_Method, VarPointsTo, ActualParam

not handled yet:
* Collection.spliterator, forEachRemaining
* stream, parallelStream

handled:
* Set is just a Collection
* Vector.elements(), elementAt, firstElement, lastElement, setElementAt, insertElementAt, addElement)
* addAll-equivalent constructors in general
* toArray
* Vector (copyInto)

if you specify --cache and you include MainClass("ca.liang.RootDriver") or whatever then it doesn't recompute facts. It will have to recompile the .dl when you change it.

in mocks.dl, comment out #define INTERPROC to get an intra-procedural version of the analysis (it assumes that everything coming in as a return value is non-mock)

## method call types

1. We look for Collection calls to be VirtualMethodInvocation, which I think is fine, as it appears to include interface invoke.

2. Let's analyze the different method call types:
* VirtualMethodInvocation: we handle this one
* StaticMethodInvocation: can't have a mock call through static, the point of mock is to have a mock receiver object
* SuperMethodInvocation, SpecialMethodInvocation: private methods, constructors, superclass methods, i.e. not mock
* DynamicMethodInvocation: could probably be used for mock calls but isn't in current Java versions
// https://www.infoq.com/articles/Invokedynamic-Javas-secret-weapon/

