package test.base.check;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class Sequence extends Checker {

    public Sequence(Delegatable delegator) {
        super(delegator);
    }

    @Override
    public boolean accept(Object expected) {
        return expected != null && expected.getClass().isArray();
    }

    @Override
    public void check(Object expected, Object actual) {
        assertTrue(actual.getClass().isArray(), "The result is not an array.");
        int length = Array.getLength(expected);
        assertEquals(length, Array.getLength(actual),
                "The actual length is not as expected.");
        for (int i = 0; i < length; i++) {
            delegate(Array.get(expected, i), Array.get(actual, i));
        }
        
    }
}
