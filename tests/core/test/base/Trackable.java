package test.base;

import java.lang.reflect.Method;
import java.util.Arrays;

interface Trackable extends Contextual {

    default void track(Method method, Object[] args) {
        Tracker tracker = context(Tracker.class, Tracker::new);
        String title = entitle(tracker.tick());
        System.out.println(title + method.getName() + stringify(args));
    }

    private static String entitle(int num) {
        return String.format("[T%1$2s]", num).replace(' ', '0');
    }

    private static String stringify(Object[] args) {
        return args == null ? "()" : Arrays.toString(args)
                .replaceFirst("^\\[", "(")
                .replaceFirst("]$", ")");
    }

    class Tracker implements Context {
        private int counter = 0;

        private int tick() {
            return ++counter;
        }
    }
}
