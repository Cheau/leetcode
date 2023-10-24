package test.ext.check;

import static org.junit.jupiter.api.Assertions.assertTrue;

public interface ArgsResult<T> extends Arguments<T>, Result<T> {

    default ExpectedArgsResult result(Object expected) {
        return new ExpectedArgsResult(expected);
    }

    @Override
    default void check(Object expected, Object[] args, Object result) {
        assertTrue(expected instanceof ExpectedArgsResult,
                "The argument expected should be an instance of ExpectedArgsResult");
        ExpectedArgsResult argsResult = (ExpectedArgsResult) expected;
        Arguments.super.check(argsResult.arguments, args, result);
        Result.super.check(argsResult.result, args, result);
    }

    final class ExpectedArgsResult {
        private final ExpectedArguments arguments = new ExpectedArguments();
        private final Object result;
        ExpectedArgsResult(Object result) {
            this.result = result;
        }

        public ExpectedArgsResult arg(Object expected) {
            arguments.arg(expected);
            return this;
        }

        public ExpectedArgsResult arg(Object expected, int index) {
            arguments.arg(expected, index);
            return this;
        }
    }
}
