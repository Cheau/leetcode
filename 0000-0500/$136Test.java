import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class $136Test extends AbstractTest<$136> {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertEquals(expected, result);
    }

    @Test
    void test1() {
        int[] nums = {2, 2, 1};
        super.test(1, nums);
    }

    @Test
    void test2() {
        int[] nums = {4, 1, 2, 1, 2};
        super.test(4, nums);
    }

    @Test
    void test3() {
        int[] nums = {1};
        super.test(1, nums);
    }
}
