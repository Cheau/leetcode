import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class $119Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(Arrays.asList(1, 3, 3, 1), 3);
    }

    @Test
    void test2() {
        super.test(Arrays.asList(1), 0);
    }

    @Test
    void test3() {
        super.test(Arrays.asList(1, 1), 1);
    }

}