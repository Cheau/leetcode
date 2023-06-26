import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $125Test extends AbstractTest {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertEquals(expected, result);
    }

    @Test
    void test1() {
        String s = "A man, a plan, a canal: Panama";
        super.test(true, s);
    }

    @Test
    void test2() {
        String s = "race a car";
        super.test(false, s);
    }

    @Test
    void test3() {
        String s = " ";
        super.test(true, s);
    }
}