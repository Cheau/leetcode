import test.AbstractTest;
import test.ext.check.Result;
import test.ext.unboxing.DualCollection;
import org.junit.jupiter.api.Test;

class $118Test extends AbstractTest implements DualCollection, Result {

    @Test
    void test1() {
        super.test(new int[][] {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}}, 5);
    }

    @Test
    void test2() {
        super.test(new int[][] {{1}}, 1);
    }

}