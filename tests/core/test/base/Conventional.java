package test.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.fail;

interface Conventional<T> extends Contextual {

    @SuppressWarnings("unchecked")
    default Convention<T> getConvention() {
        return context(Convention.class, supply());
    }

    default T getTarget() {
        return getConvention().target;
    }

    default boolean isTestee(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private Supplier<Convention> supply() {
        return () -> {
            Convention<T> convention = new Convention<>();
            convention.type = getType();
            convention.target = getTarget(convention.type);
            convention.methods = getMethods(convention.type);
            return convention;
        };
    }

    @SuppressWarnings("unchecked")
    private Class<T> getType() {
        String name = this.getClass().getName().replaceAll("Test$", "");
        try {
            return (Class<T>) Class.forName(name);
        } catch (Exception e) {
            fail(e);
            return null;
        }
    }

    private T getTarget(Class<T> type) {
        try {
            Constructor<T> constructor = type.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (Exception e) {
            fail(e);
        }
        return null;
    }

    private List<Method> getMethods(Class<T> type) {
        try {
            Method[] declaredMethods = type.getDeclaredMethods();
            return Arrays.stream(declaredMethods)
                    .filter(this::isTestee)
                    .peek(method -> method.setAccessible(true))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            fail(e);
        }
        return Collections.emptyList();
    }

    class Convention<T> implements Context {
        private Class<T> type;
        private T target;
        private List<Method> methods;

        public Class<T> getType() {
            return type;
        }

        public List<Method> getMethods() {
            return methods;
        }
    }
}
