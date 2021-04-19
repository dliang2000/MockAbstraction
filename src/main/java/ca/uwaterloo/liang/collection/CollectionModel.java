package ca.uwaterloo.liang.collection;

import soot.SootMethod;

public interface CollectionModel<E> {

    Effect getEffect(SootMethod m);
}
