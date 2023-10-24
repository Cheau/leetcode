import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $268Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(2, new int[] {3, 0, 1});
    }

    @Test
    void test2() {
        super.test(2, new int[] {0, 1});
    }

    @Test
    void test3() {
        super.test(8, new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1});
    }

}