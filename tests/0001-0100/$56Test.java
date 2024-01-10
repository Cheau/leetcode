import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import static org.junit.jupiter.api.Assertions.*;

class $56Test extends AbstractTest implements Result {

    @Test
    void test1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        super.test(expected, (Object) intervals);
    }

    @Test
    void test2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        super.test(expected, (Object) intervals);
    }

    @Test
    void test3() {
        int[][] intervals = {{1, 4}, {0, 4}};
        int[][] expected = {{0, 4}};
        super.test(expected, (Object) intervals);
    }

    @Test
    void test4() {
        int[][] intervals = {{1, 4}, {2, 3}};
        int[][] expected = {{1, 4}};
        super.test(expected, (Object) intervals);
    }

    @Test
    void test5() {
        int[][] intervals = {{4, 5}, {1, 4}, {0, 1}};
        int[][] expected = {{0, 5}};
        super.test(expected, (Object) intervals);
    }

    @Test
    void test6() {
        int[][] intervals = {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};
        int[][] expected = {{1, 10}};
        super.test(expected, (Object) intervals);
    }

    @Test
    void test7() {
        int[][] intervals = {{2, 2}, {1, 3}, {3, 3}, {3, 4}, {2, 3}, {4, 5}, {4, 4}};
        int[][] expected = {{1, 5}};
        super.test(expected, (Object) intervals);
    }

}