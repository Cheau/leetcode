import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $7Test extends AbstractTest implements Result {

    @Test
    void test1() {
        int x = Integer.MAX_VALUE;
        super.test(0, x);
    }

    @Test
    void test2() {
        int x = Integer.MIN_VALUE;
        super.test(0, x);
    }

    @Test
    void test3() {
        int x = 123;
        super.test(321, x);
    }

    @Test
    void test4() {
        int x = -123;
        super.test(-321, x);
    }

    @Test
    void test5() {
        int x = 120;
        super.test(21, x);
    }

    @Test
    void test6() {
        int x = -2147483412;
        super.test(-2143847412, x);
    }

    @Test
    void test7() {
        int x = 1534236469;
        super.test(0, x);
    }
}