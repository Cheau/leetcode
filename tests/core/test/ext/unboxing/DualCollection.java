package test.ext.unboxing;

import java.util.Collection;
import test.base.Testable;

import static org.junit.jupiter.api.Assertions.assertTrue;

public interface DualCollection<T> extends Testable<T> {
    @Override
    default Object[][] unbox(Object result) {
        assertTrue(result instanceof Collection<?>, "The result is not a collection!");
        Collection<?> collection = (Collection<?>) result;
        Object[] items = collection.toArray();
        Object[][] dual = new Object[collection.size()][];
        for (int i = 0; i < collection.size(); i++) {
            assertTrue(items[i] instanceof Collection<?>, "The inner item is not a collection!");
            dual[i] = ((Collection<?>) items[i]).toArray(new Object[0]);
        }
        return dual;
    }
}
