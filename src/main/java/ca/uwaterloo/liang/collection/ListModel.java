package ca.uwaterloo.liang.collection;

import java.util.Collection;

import soot.SootMethod;

public interface ListModel<E> extends CollectionModel<E> {
    Effect getEffect(SootMethod m);
}
