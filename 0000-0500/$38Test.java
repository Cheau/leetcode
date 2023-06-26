import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $38Test extends AbstractTest<$38> {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertEquals(expected, result);
    }

    @Test
    void test1() {
        super.test("1", 1);
    }

    @Test
    void test2() {
        super.test("11", 2);
    }

    @Test
    void test3() {
        super.test("21", 3);
    }

    @Test
    void test4() {
        super.test("1211", 4);
    }
}