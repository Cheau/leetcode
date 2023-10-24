package test.base.check;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public abstract class Checker {

    private final Delegatable delegator;

    protected Checker(Delegatable delegator) {
        assertNotNull(delegator);
        this.delegator = delegator;
    }

    protected abstract boolean accept(Object expected);

    protected abstract void check(Object expected, Object actual);

    protected final void delegate(Object expected, Object actual) {
        delegator.delegate(expected, actual);
    }
}
