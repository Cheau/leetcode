import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Arguments;

import java.util.Arrays;

class $189Test extends AbstractTest implements Arguments {

    @Test
    void test1() {
        int[] nums = new int[7];
        Arrays.setAll(nums, i -> i + 1);
        int[] expected = new int[] {5, 6, 7, 1, 2, 3, 4};
        super.test(arg(expected), nums, 3);
        // 1, 2, 3, 4, 5, 6, 7
        // 3, 2, 1, 7, 6, 5, 4
        // 5, 6, 7, 1, 2, 3, 4
    }

    @Test
    void test2() {
        int[] expected = new int[] {3, 99, -1, -100};
        super.test(arg(expected), new int[] {-1, -100, 3, 99}, 2);
    }

    @Test
    void test3() {
        int[] nums = new int[27];
        Arrays.setAll(nums, i -> i + 1);
        int[] expected = new int[27];
        Arrays.setAll(expected, i -> i < 11 ? i + 17 : i - 10);
        super.test(arg(expected), nums, 38);
    }

    @Test
    void test4() {
        int[] nums = new int[6];
        Arrays.setAll(nums, i -> i + 1);
        int[] expected = new int[] {3, 4, 5, 6, 1, 2};
        super.test(arg(expected), nums, 4);
        // 1, 2, 3, 4, 5, 6
        // 4, 3, 2, 1, 6, 5
        // 3, 4, 5, 6, 1, 2
    }

    @Test
    void test5() {
        int[] nums = new int[30];
        Arrays.setAll(nums, i -> i + 1);
        int[] expected = new int[30];
        Arrays.setAll(expected, i -> i < 11 ? i + 20 : i - 10);
        super.test(arg(expected), nums, 41);
    }

}