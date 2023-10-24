import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

public class $1Test extends AbstractTest implements Result {

    @Test
    void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        super.test(new int[]{0, 1}, nums, target);
    }

    @Test
    void test2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        super.test(new int[]{1, 2}, nums, target);
    }

    @Test
    void test3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        super.test(new int[]{0, 1}, nums, target);
    }
}
