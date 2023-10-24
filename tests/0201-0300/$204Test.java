import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $204Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(4, 10);
    }

    @Test
    void test2() {
        super.test(0, 0);
    }

    @Test
    void test3() {
        super.test(0, 1);
    }

    @Test
    void test4() {
        super.test(1, 3);
    }

    @Test
    void test5() {
        super.test(25, 100);
    }

    @Test
    void test6() {
        super.test(168, 1000);
    }

    @Test
    void test7() {
        super.test(9592, 100000);
    }

    @Test
    void test8() {
        super.test(78498, 1000000);
    }

}