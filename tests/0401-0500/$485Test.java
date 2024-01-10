import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import static org.junit.jupiter.api.Assertions.*;

class $485Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(3, (Object) new int[] {1, 1, 0, 1, 1, 1});
    }

    @Test
    void test2() {
        super.test(2, (Object) new int[] {1, 0, 1, 1, 0, 1});
    }

}