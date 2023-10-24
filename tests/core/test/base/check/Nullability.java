package test.base.check;

import static org.junit.jupiter.api.Assertions.*;

class Nullability extends Checker {

    public Nullability(Delegatable delegator) {
        super(delegator);
    }

    public boolean accept(Object expected) {
        return expected == null;
    }

    public void check(Object expected, Object actual) {
        assertNull(actual);
    }
}
