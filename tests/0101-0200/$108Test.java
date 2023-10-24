import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;
import tree.binary.TreeNode;

class $108Test extends AbstractTest implements Result {

    @Override
    public Object unbox(Object result) {
        return ((TreeNode) result).bfs();
    }

    @Test
    void test1() {
        int[] nums = {-10, -3, 0, 5, 9};
        Integer[] expected = new Integer[] {0, -3, 9, -10, null, 5};
        super.test(expected, (Object) nums);
    }

    @Test
    void test2() {
        int[] nums = {1, 3};
        Integer[] expected = new Integer[] {3, 1};
        super.test(expected, (Object) nums);
    }
}