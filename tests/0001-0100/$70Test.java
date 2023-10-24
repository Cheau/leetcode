import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $70Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(2, 2);
    }

    @Test
    void test2() {
        super.test(3, 3);
    }

}