package test.base.check;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class Iteration extends Checker {

    public Iteration(Delegatable<?> delegator) {
        super(delegator);
    }

    @Override
    public boolean accept(Object expected) {
        return expected instanceof Iterable<?>;
    }

    @Override
    public void check(Object expected, Object actual) {
        assertTrue(actual instanceof Iterable<?>, "The actual is not iterable.");
        Iterator<?> exp = ((Iterable<?>) expected).iterator();
        Iterator<?> act = ((Iterable<?>) actual).iterator();
        while (exp.hasNext() && act.hasNext()) {
            delegate(exp.next(), act.next());
        }
        if (exp.hasNext() || act.hasNext()) fail("The actual amount is not as expected.");
    }
}
