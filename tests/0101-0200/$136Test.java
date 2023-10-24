import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

public class $136Test extends AbstractTest implements Result {

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
