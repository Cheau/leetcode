import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import static org.junit.jupiter.api.Assertions.*;

class $561Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(4, (Object) new int[] {1, 4, 3, 2});
    }

    @Test
    void test2() {
        super.test(9, (Object) new int[] {6, 2, 6, 5, 1, 2});
    }

}