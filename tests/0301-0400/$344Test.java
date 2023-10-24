import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

public class $344Test extends AbstractTest implements Result {

    @Override
    public void check(Object expected, Object[] args, Object result) {
        Result.super.check(expected, args, args[0]);
    }

    @Test
    void test1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        super.test(expected, s);
    }

    @Test
    void test2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        super.test(expected, s);
    }
}
