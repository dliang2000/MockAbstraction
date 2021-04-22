package ca.uwaterloo.liang.collection;

import soot.SootMethod;

public abstract class CollectionModel<E> {

    public abstract CollectionModelEffect getEffect(SootMethod m);
}
