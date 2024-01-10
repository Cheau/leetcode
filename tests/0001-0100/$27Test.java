import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.base.check.Delegatable;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class $27Test extends AbstractTest implements Delegatable {

    @Override
    public void check(Object expected, Object[] args, Object result) {
        int[] target = (int[]) expected;
        assertEquals(target.length, result);
        int[] original = (int[]) args[0];
        int[] actual = Arrays.copyOfRange(original, 0, target.length);
        Arrays.sort(target);
        Arrays.sort(actual);
        delegate(target, actual);
    }

    @Test
    void test1() {
        super.test(new int[] {2, 2}, new int[] {3, 2, 2, 3}, 3);
    }

    @Test
    void test2() {
        super.test(new int[] {0, 1, 3, 0, 4}, new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }

    @Test
    void test3() {
        super.test(new int[] {}, new int[] {1}, 1);
    }
}