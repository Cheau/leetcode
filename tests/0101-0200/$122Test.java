import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import static org.junit.jupiter.api.Assertions.*;

class $122Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(7, (Object) new int[] {7, 1, 5, 3, 6, 4});
    }

    @Test
    void test2() {
        super.test(4, (Object) new int[] {1, 2, 3, 4, 5});
    }

    @Test
    void test3() {
        super.test(0, (Object) new int[] {7, 6, 4, 3, 1});
    }

}