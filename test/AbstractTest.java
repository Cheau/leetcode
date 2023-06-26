import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class AbstractTest<T> {

  private T solution;

  private List<Method> methods;

  protected abstract void check(Object expected, Object[] args, Object result);

  @SuppressWarnings("unchecked cast")
  private Class<T> getTarget() throws ClassNotFoundException {
    String name = this.getClass().getName().replaceAll("Test$", "");
    return (Class<T>) Class.forName(name);
  }

  private Object[] clone(Object[] args) {
    return Arrays.stream(args)
        .map(
            arg -> {
              if (arg.getClass().isArray()) {
                int length = Array.getLength(arg);
                Object replica = Array.newInstance(arg.getClass().getComponentType(), length);
                System.arraycopy(arg, 0, replica, 0, length);
                return replica;
              }
              return arg;
            })
        .toArray();
  }

  protected void test(Object expected, Object... args) {
    methods.forEach(
        m -> {
          try {
            System.out.println("Testing Method: " + m.getName());
            Object[] replicas = clone(args);
            Object result = m.invoke(solution, replicas);
            check(expected, replicas, result);
          } catch (IllegalAccessException | InvocationTargetException e) {
            fail(e.getMessage(), e);
          }
        });
  }

  /**
   * Set up the solution and methods to be tested.
   * @throws InstantiationException InstantiationException
   * @throws IllegalAccessException IllegalAccessException
   * @throws NoSuchMethodException NoSuchMethodException
   * @throws InvocationTargetException InvocationTargetException
   * @throws ClassNotFoundException ClassNotFoundException
   */
  @BeforeAll
  public void setUp()
      throws InstantiationException, IllegalAccessException, NoSuchMethodException,
          InvocationTargetException, ClassNotFoundException {
    Constructor<T> constructor = getTarget().getDeclaredConstructor();
    constructor.setAccessible(true);
    solution = constructor.newInstance();
    Method[] declaredMethods = getTarget().getDeclaredMethods();
    this.methods =
        Arrays.stream(declaredMethods)
            .filter(
                m -> {
                  m.setAccessible(true);
                  return Modifier.isPublic(m.getModifiers());
                })
            .collect(Collectors.toList());
  }
}
