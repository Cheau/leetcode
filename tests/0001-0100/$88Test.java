import test.AbstractTest;
import test.ext.check.Arguments;
import org.junit.jupiter.api.Test;

class $88Test extends AbstractTest implements Arguments {

    @Test
    void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        super.test(arg(expected, 0), nums1, m, nums2, n);
    }

    @Test
    void test2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        super.test(arg(expected, 0), nums1, m, nums2, n);
    }

    @Test
    void test3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        super.test(arg(expected, 0), nums1, m, nums2, n);
    }
}