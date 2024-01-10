import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import static org.junit.jupiter.api.Assertions.*;

class $167Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(new int[] {1, 2}, new int[] {2, 7, 11, 15}, 9);
    }

    @Test
    void test2() {
        super.test(new int[] {1, 3}, new int[] {2, 3, 4}, 6);
    }

    @Test
    void test3() {
        super.test(new int[] {1, 2}, new int[] {-1, 0}, -1);
    }

    @Test
    void test4() {
        super.test(new int[] {1, 2}, new int[] {0, 0, 3, 4}, 0);
    }

    @Test
    void test5() {
        super.test(new int[] {1, 2}, new int[] {-3, 3, 4, 90}, 0);
    }

}