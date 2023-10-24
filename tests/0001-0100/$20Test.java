import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $20Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(true, "()");
    }

    @Test
    void test2() {
        super.test(true, "()[]{}");
    }

    @Test
    void test3() {
        super.test(false, "(]");
    }

    @Test
    void test4() {
        super.test(true, "{[()]()}");
    }

    @Test
    void test5() {
        super.test(false, "]");
    }

    @Test
    void test6() {
        super.test(false, "([{{])");
    }

    @Test
    void test7() {
        super.test(true, "([{}])");
    }

}