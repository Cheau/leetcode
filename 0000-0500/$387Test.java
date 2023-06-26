import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $387Test extends AbstractTest {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertEquals(expected, result);
    }

    @Test
    void test1() {
        String s = "leetcode";
        super.test(0, s);
    }

    @Test
    void test2() {
        String s = "loveleetcode";
        super.test(2, s);
    }

    @Test
    void test3() {
        String s = "aabb";
        super.test(-1, s);
    }
}