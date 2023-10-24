import org.junit.jupiter.api.Test;
import test.AbstractTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class $14Test extends AbstractTest {

    @Override
    public void check(Object expected, Object[] args, Object result) {
        assertEquals(expected, result);
    }

    @Test
    void test1() {
        String[] strs = {"flower", "flow", "flight"};
        super.test("fl", (Object) strs);
    }

    @Test
    void test2() {
        String[] strs = {"dog", "racecar", "car"};
        super.test("", (Object) strs);
    }

    @Test
    void test3() {
        String[] strs = {""};
        super.test("", (Object) strs);
    }
}