package test.ext.check;

import test.base.check.Delegatable;

public interface Custom<T> extends Delegatable<T> {
    @Override
    default void check(Object expected, Object[] args, Object result) {}
}
