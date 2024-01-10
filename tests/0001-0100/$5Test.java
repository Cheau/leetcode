import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

class $5Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test("bab", "babad");
    }

    @Test
    void test2() {
        super.test("bb", "cbbd");
    }

    @Test
    void test3() {
        super.test("a", "a");
    }

    @Test
    void test4() {
        super.test("a", "ac");
    }

    @Test
    void test5() {
        super.test("bb", "bb");
    }

}