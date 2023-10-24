package test.base.check;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Equality extends Checker {

    public Equality(Delegatable delegator) {
        super(delegator);
    }

    @Override
    public boolean accept(Object expected) {
        return expected != null && !expected.getClass().isArray() && !(expected instanceof Iterable<?>);
    }

    @Override
    public void check(Object expected, Object actual) {
        assertEquals(expected, actual);
    }
}
