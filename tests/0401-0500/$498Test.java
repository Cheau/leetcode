import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

class $498Test extends AbstractTest implements Result {

    @Test
    void test1() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        super.test(expected, (Object) mat);
    }

    @Test
    void test2() {
        int[][] mat = {{1, 2}, {3, 4}};
        int[] expected = {1, 2, 3, 4};
        super.test(expected, (Object) mat);
    }

    @Test
    void test3() {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[] expected = {1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12};
        super.test(expected, (Object) mat);
    }

}