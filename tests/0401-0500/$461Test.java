import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

class $461Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(2, 1, 4);
    }

    @Test
    void test2() {
        super.test(1, 3, 1);
    }

    @Test
    void test3() {
        super.test(2, 93, 73);
    }

}