import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import static org.junit.jupiter.api.Assertions.*;

class $209Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(2, 7, new int[] {2, 3, 1, 2, 4, 3});
    }

    @Test
    void test2() {
        super.test(1, 4, new int[] {1, 4, 4});
    }


    @Test
    void test3() {
        super.test(0, 11, new int[] {1, 1, 1, 1, 1, 1, 1, 1});
    }


    @Test
    void test4() {
        super.test(3, 11, new int[] {1, 2, 3, 4, 5});
    }

}