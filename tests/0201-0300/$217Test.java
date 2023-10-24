import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import java.util.Arrays;

class $217Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(true, (Object) new int[] {1, 2, 3, 1});
    }

    @Test
    void test2() {
        super.test(false, (Object) new int[] {1, 2, 3, 4});
    }

    @Test
    void test3() {
        super.test(true, (Object) new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
    }

    @Test
    void test4() {
        super.test(true, (Object) new int[] {0, 4, 5, 0, 3, 6});
    }

    @Test
    void test5() {
        int[] nums = new int[100];
        Arrays.setAll(nums, i -> i);
        super.test(false, (Object) nums);
    }

    @Test
    void test6() {
        super.test(true, (Object) new int[] {1000000000, 1000000000, 11});
    }

}