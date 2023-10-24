package test.ext.check;

import java.util.ArrayList;
import java.util.List;
import test.base.check.Delegatable;

import static org.junit.jupiter.api.Assertions.assertTrue;

public interface Arguments<T> extends Delegatable<T> {

    default ExpectedArguments arg(Object expected) {
        return new ExpectedArguments().arg(expected);
    }

    default ExpectedArguments arg(Object expected, int index) {
        return new ExpectedArguments().arg(expected, index);
    }

    @Override
    default void check(Object expected, Object[] args, Object result) {
        assertTrue(expected instanceof ExpectedArguments,
            "The argument expected should be an instance of ExpectedArguments");
        ExpectedArguments expectedArguments = (ExpectedArguments) expected;
        expectedArguments.arguments.forEach(argument -> delegate(argument.expected, args[argument.index]));
    }

    final class ExpectedArgument {
        private final Object expected;
        private final int index;
        private ExpectedArgument(Object expected, int index) {
            this.expected = expected;
            this.index = index;
        }
    }

    final class ExpectedArguments {
        private final List<ExpectedArgument> arguments = new ArrayList<>();

        public ExpectedArguments arg(Object expected) {
            return arg(expected, 0);
        }

        public ExpectedArguments arg(Object expected, int index) {
            arguments.add(new ExpectedArgument(expected, index));
            return this;
        }
    }
}
