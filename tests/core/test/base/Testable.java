package test.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.fail;

public interface Testable<T> extends
        Boxing,
        Conventional<T>,
        Replicable,
        Trackable,
        Unboxing
{

    void check(Object expected, Object[] args, Object result);

    default void test(Object expected, Object... args) {
        getConvention().getMethods().forEach((method) -> {
            track(method, args);
            test(method, expected, args);
        });
    }

    default void test(Method method, Object expected, Object... args) {
        try {
            Object[] replicas = replicate(args);
            for (int i = 0; i < replicas.length; i++) {
                replicas[i] = box(i, replicas[i]);
            }
            Object result = method.invoke(getTarget(), replicas);
            result = unbox(result);
            check(expected, replicas, result);
        } catch (IllegalAccessException | InvocationTargetException e) {
            fail(e);
        }
    }
}
