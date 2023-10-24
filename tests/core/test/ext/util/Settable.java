package test.ext.util;

import test.base.Testable;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.fail;

public interface Settable<T> extends Testable<T> {

    default void set(String name, Object value) {
        try {
            Field field = getField(name);
            field.setAccessible(true);
            field.set(getTarget(), value);
        } catch (Exception e) {
            fail(e);
        }
    }

    default Field getField(String name) {
        Field field = null;
        Class<?> clazz = getConvention().getType();
        do {
            try {
                field = clazz.getDeclaredField(name);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
            }
        } while (field == null && clazz != null);
        return field;
    }
}
