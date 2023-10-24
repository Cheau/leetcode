import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $13Test extends AbstractTest implements Result {

    @Test
    void test1() {
        super.test(3, "III");
    }

    @Test
    void test2() {
        super.test(58, "LVIII");
    }

    @Test
    void test3() {
        super.test(1994, "MCMXCIV");
    }

}