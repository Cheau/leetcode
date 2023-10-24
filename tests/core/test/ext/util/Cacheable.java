package test.ext.util;

import test.base.Testable;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public interface Cacheable<T> extends Testable<T> {
    ThreadLocal<List<Case>> cases = ThreadLocal.withInitial(ArrayList::new);

    default void cache(Object expected, Object... args) {
        cases.get().add(new Case(expected, args));
    }

    default void flush() {
        getConvention().getMethods().forEach((method) -> {
            track(method, new Object[] {"[BATCH]"});
            Instant start = Instant.now();
            cases.get().forEach(c -> test(method, c.expected, c.args));
            Instant end = Instant.now();
            long elapsed = Duration.between(start, end).toMillis();
            System.out.println("time: " + elapsed + "ms");
        });
        cases.get().clear();
    }

    class Case {
        private final Object expected;
        private final Object[] args;

        Case(Object expected, Object[] args) {
            this.expected = expected;
            this.args = args;
        }
    }
}
