import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $125Test extends AbstractTest implements Result {

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