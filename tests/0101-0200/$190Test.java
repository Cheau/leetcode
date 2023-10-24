import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $190Test extends AbstractTest implements Result {

    @Test
    void test0() {
        super.test(Integer.MIN_VALUE, 1);
    }

    @Test
    void test1() {
        super.test(964176192,43261596);
    }

    @Test
    void test2() {
        super.test(-1073741825,-3);
    }

}