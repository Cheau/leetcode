import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

class $35Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(2, new int[] {1, 3, 5, 6}, 5);
    }

    @Test
    void test2() {
        super.test(1, new int[] {1, 3, 5, 6}, 2);
    }

    @Test
    void test3() {
        super.test(4, new int[] {1, 3, 5, 6}, 7);
    }

    @Test
    void test4() {
        super.test(0, new int[] {1}, 1);
    }

    @Test
    void test5() {
        super.test(0, new int[] {1, 3}, 0);
    }

}