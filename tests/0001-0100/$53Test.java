import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $53Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(6, new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }

    @Test
    void test2() {
        super.test(1, new int[] {1});
    }

    @Test
    void test3() {
        super.test(23, new int[] {5, 4, -1, 7, 8});
    }

    @Test
    void test4() {
        super.test(-1, new int[] {-1, -2});
    }
}