package test.base.check;

import test.base.Testable;

import static org.junit.jupiter.api.Assertions.fail;

public interface Delegatable<T> extends Testable<T> {

    default Checker[] getCheckers() {
        return new Checker[] {
                new Equality(this),
                new Iteration(this),
                new Nullability(this),
                new Sequence(this)
        };
    }

    default void delegate(Object expected, Object actual) {
        Checker[] checkers = getCheckers();
        boolean accepted = false;
        for (Checker checker : checkers) {
            accepted = checker.accept(expected);
            if (accepted) {
                checker.check(expected, actual);
                break;
            }
        }
        if (!accepted) fail("No matched checker found.");
    }
}
