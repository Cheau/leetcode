import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class $350Test extends AbstractTest implements Result {

    @Override
    public void check(Object expected, Object[] args, Object result) {
        Arrays.sort((int[]) result);
        Result.super.check(expected, args, result);
    }

    @Test
    void test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        super.test(new int[]{2, 2}, nums1, nums2);
    }

    @Test
    void test2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        super.test(new int[]{4, 9}, nums1, nums2);
    }
}
