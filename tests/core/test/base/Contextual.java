package test.base;

import java.util.function.Supplier;

interface Contextual {

    default <T extends Context> T context(Class<T> type, Supplier<T> supplier) {
        return Contexts.of(this).get(type, supplier);
    }
}
