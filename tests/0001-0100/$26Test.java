import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.ArgsResult;

class $26Test extends AbstractTest implements ArgsResult {

    @Test
    void test1() {
        ExpectedArgsResult expected = result(2).arg(new int[] {1, 2, 2});
        super.test(expected, (Object) new int[] {1, 1, 2});
    }

    @Test
    void test2() {
        ExpectedArgsResult expected = result(5).arg(new int[] {0, 1, 2, 3, 4, 2, 2, 3, 3, 4});
        super.test(expected, (Object) new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}