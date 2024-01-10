import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import static org.junit.jupiter.api.Assertions.*;

class $153Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(1, (Object) new int[] {3, 4, 5, 1, 2});
    }

    @Test
    void test2() {
        super.test(0, (Object) new int[] {4, 5, 6, 7, 0, 1, 2});
    }

    @Test
    void test3() {
        super.test(11, (Object) new int[] {11, 13, 15, 17});
    }

    @Test
    void test4() {
        super.test(1, (Object) new int[] {2, 1});
    }

}