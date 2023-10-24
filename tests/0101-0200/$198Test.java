import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $198Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(4, new int[] {1, 2, 3, 1});
    }

    @Test
    void test2() {
        super.test(12, new int[] {2, 7, 9, 3, 1});
    }

}