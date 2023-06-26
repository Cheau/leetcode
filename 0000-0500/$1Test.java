import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class $1Test extends AbstractTest<$1> {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertArrayEquals((int[]) expected, (int[]) result);
    }

    @Test
    void test1() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        super.test(new int[] {0, 1}, nums, target);
    }

    @Test
    void test2() {
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        super.test(new int[] {1, 2}, nums, target);
    }

    @Test
    void test3() {
        int[] nums = new int[] {3, 3};
        int target = 6;
        super.test(new int[] {0, 1}, nums, target);
    }
}
