import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $121Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(5, new int[]{7, 1, 5, 3, 6, 4});
    }

    @Test
    void test2() {
        super.test(0, new int[]{7, 6, 6, 3, 1});
    }

}