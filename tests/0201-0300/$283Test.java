import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

public class $283Test extends AbstractTest implements Result {

    @Override
    public void check(Object expected, Object[] args, Object result) {
        Result.super.check(expected, args, args[0]);
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
