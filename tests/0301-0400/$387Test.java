import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $387Test extends AbstractTest implements Result {

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