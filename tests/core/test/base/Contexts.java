package test.base;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class Contexts {

    private static final Map<Contextual, Holder> map = new HashMap<>();

    static Holder of(Contextual owner) {
        if (!map.containsKey(owner)) {
            map.put(owner, new Holder());
        }
        return map.get(owner);
    }

    static class Holder {
        private final Map<Class<?>, Context> map = new HashMap<>();

        @SuppressWarnings("unchecked")
        <T extends Context> T get(Class<T> type, Supplier<T> supplier) {
            if (!map.containsKey(type)) {
                map.put(type, supplier.get());
            }
            return (T) map.get(type);
        }
    }
}
