import test.AbstractTest;
import test.ext.check.Result;
import test.ext.util.Settable;
import org.junit.jupiter.api.Test;

class $278Test extends AbstractTest implements Result, Settable {

    private static final String FIRST_BAD_VERSION = "firstBadVersion";

    @Test
    void test1() {
        int expected = 4;
        set(FIRST_BAD_VERSION, expected);
        super.test(expected, 5);
    }

    @Test
    void test2() {
        int expected = 1;
        set(FIRST_BAD_VERSION, expected);
        super.test(expected, 1);
    }

    @Test
    void test3() {
        int expected = 1;
        set(FIRST_BAD_VERSION, expected);
        super.test(expected, 3);
    }

    @Test
    void test4() {
        int expected = 1702766719;
        set(FIRST_BAD_VERSION, expected);
        super.test(expected, 2126753390);
    }

}