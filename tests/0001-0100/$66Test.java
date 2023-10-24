import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

public class $66Test extends AbstractTest implements Result {

    @Test
    void test1() {
        int[] digits = {1, 2, 3};
        super.test(new int[]{1, 2, 4}, digits);
    }

    @Test
    void test2() {
        int[] digits = {4, 3, 2, 1};
        super.test(new int[]{4, 3, 2, 2}, digits);
    }

    @Test
    void test3() {
        int[] digits = {9};
        super.test(new int[]{1, 0}, digits);
    }
}
