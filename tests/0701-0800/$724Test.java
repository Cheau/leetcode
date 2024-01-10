import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

class $724Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(3, (Object) new int[] {1, 7, 3, 6, 5, 6});
    }

    @Test
    void test2() {
        super.test(-1, (Object) new int[] {1, 2, 3});
    }

    @Test
    void test3() {
        super.test(0, (Object) new int[] {2, 1, -1});
    }

    @Test
    void test4() {
        super.test(3, (Object) new int[] {-1, -1, 1, 0, 0, -1});
    }

    @Test
    void test5() {
        super.test(2, (Object) new int[] {-1, -1, 0, 0, -1, -1});
    }

}