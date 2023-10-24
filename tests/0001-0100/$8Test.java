import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $8Test extends AbstractTest implements Result {

    @Test
    void test1() {
        String s = "42";
        super.test(42, s);
    }

    @Test
    void test2() {
        String s = "   -42";
        super.test(-42, s);
    }

    @Test
    void test3() {
        String s = "4193 with words";
        super.test(4193, s);
    }

    @Test
    void test4() {
        String s = "words and 987";
        super.test(0, s);
    }

    @Test
    void test5() {
        String s = "-91283472332";
        super.test(-2147483648, s);
    }

    @Test
    void test6() {
        String s = " ";
        super.test(0, s);
    }

    @Test
    void test7() {
        String s = "2147483646";
        super.test(2147483646, s);
    }

    @Test
    void test8() {
        String s = "-21474836482";
        super.test(-2147483648, s);
    }
}