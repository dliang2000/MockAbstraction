# How to convert a run-inside Doop analysis to a run-after Doop analysis

Conceptually, this is easy. In practice, there's a bunch of annoying
work involved. It should be easier to do this if one was working
inside the Doop code, because we are extracting a bunch of things that
should be easily accessible in Doop data structures.

## Getting the set of relations

The first step is to extract the relations that we're using from our
run-inside analysis. A Datalog parser would help a lot here, but I
couldn't find any that were easy to use (i.e. not written in Clojure).
Datalog parsing is easy but still takes some time. Here's the steps I
used.

* remove all string constants: I had a bunch of facts of the form
MockSourceMethod("<org.easymock.EasyMock: java.lang.Object createMock(java.lang.Class)>"),
which I didn't want. I manually deleted them.
* remove C comments and preprocessor commands
* extract candidate relations: grep -o -E '\w+' mocks-no-constants.dl | sort | uniq
* wish I had stuck with the Datalog ? convention for parameters, which would have made my life
somewhat easier.
* even though I didn't start parameters with ?, I did start parameters with capital letters, so that helped.

I manually put all the relations that I used into all-relations.txt.

There is a caveat: any relations that have dots in their name must be renamed to something that's not a dot for use in the run-after analysis. I used underscores.

## Creating various .dl files

I created 4 sub-files based on all-relations.txt: output-relations.dl, decl-relations.dl, input-relations.dl, and types.dl.

1. output-relations.dl is easiest:

```sed 's/^/.output /' all-relations.txt > output-relations.dl```

You add #include "output-relations.dl" to your run-inside Doop
analysis and run the Doop analysis with it to get the relations you
need for the run-after analysis.

2. input-relations.dl is fairly easy as well:

while read line ; do echo .input $line\(IO=\"file\", filename=\"$line.csv\", delimiter=\"\\t\"\) ; done > input-relations.dl < souffle-logic/analyses/mocks/all-relations.txt

3. types.dl and decl-relations.dl are a bit trickier. I extracted the
declarations from doop's rules.html. It turns out that you need to
provide enough of a type hierarchy for this to work. I did not need to
provide constraints for Context, but I did provide everything else.

After I did that, I could run my analysis in 12 seconds instead of
2m30 (on top of the basic-only analysis) or 5m30 (on top of
context-insensitive).

# Note relevant to our context

We use various #ifdefs in our Doop analysis to enable and disable various things.

The selection of the call graph (USE_BASIC vs USE_CALLGRAPH along with
-a basic-only vs -a context-insensitive respectively) is encapsulated
in which CallGraph relation we output. The mocks-after.dl file just needs to
.input the correct CallGraph.

The NO_FIELDS, NO_INTERPROC, NO_COLLECTIONS, and NO_ARRAYS flags can be specified
with souffle's -M flag.

A typical Souffle command line therefore looks like this:

```time souffle -F last-analysis -M NO_FIELDS souffle-logic/analyses/mocks/mocks-after.dl```
