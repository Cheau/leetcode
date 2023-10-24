import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $326Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(true, 27);
    }

    @Test
    void test2() {
        super.test(false, 0);
    }

    @Test
    void test3() {
        super.test(false, -1);
    }

    @Test
    void test4() {
        super.test(true, 3);
    }

}