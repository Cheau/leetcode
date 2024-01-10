import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Arguments;

import static org.junit.jupiter.api.Assertions.*;

class $73Test extends AbstractTest implements Arguments {

    @Test
    void test1() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        super.test(arg(expected), (Object) matrix);
    }

    @Test
    void test2() {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        super.test(arg(expected), (Object) matrix);
    }

    @Test
    void test3() {
        int[][] matrix = {{1, 0}};
        int[][] expected = {{0, 0}};
        super.test(arg(expected), (Object) matrix);
    }

    @Test
    void test4() {
        int[][] matrix = {{1}, {0}};
        int[][] expected = {{0}, {0}};
        super.test(arg(expected), (Object) matrix);
    }

}