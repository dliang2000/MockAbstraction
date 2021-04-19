package ca.uwaterloo.liang.collection;

import soot.SootMethod;

public abstract class CollectionModel<E> {

    public abstract Effect getEffect(SootMethod m);
}
