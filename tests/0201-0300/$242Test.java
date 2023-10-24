import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $242Test extends AbstractTest implements Result {

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