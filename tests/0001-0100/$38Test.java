import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $38Test extends AbstractTest implements Result {

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