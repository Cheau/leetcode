import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class $283Test extends AbstractTest<$283> {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertArrayEquals((int[]) expected, (int[]) args[0]);
    }

    @Test
    void test1() {
        int[] nums = {0, 1, 0, 3, 12};
        super.test(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void test2() {
        int[] nums = {0};
        super.test(new int[]{0}, nums);
    }
}
