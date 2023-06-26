import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $242Test extends AbstractTest {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertEquals(expected, result);
    }

    @Test
    void test1() {
        String s = "anagram";
        String t = "nagaram";
        super.test(true, s, t);
    }

    @Test
    void test2() {
        String s = "rat";
        String t = "car";
        super.test(false, s, t);
    }
}