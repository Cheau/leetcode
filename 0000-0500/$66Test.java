import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class $66Test extends AbstractTest<$66> {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertArrayEquals((int[]) expected, (int[]) result);
    }

    @Test
    void test1() {
        int[] digits = {1, 2, 3};
        super.test(new int[] {1, 2, 4}, digits);
    }

    @Test
    void test2() {
        int[] digits = {4, 3, 2, 1};
        super.test(new int[] {4, 3, 2, 2}, digits);
    }

    @Test
    void test3() {
        int[] digits = {9};
        super.test(new int[] {1, 0}, digits);
    }
}
