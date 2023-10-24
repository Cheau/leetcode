import test.AbstractTest;
import test.ext.check.Result;
import test.ext.unboxing.DualCollection;
import org.junit.jupiter.api.Test;
import tree.binary.TreeNode;

class $102Test extends AbstractTest implements DualCollection, Result {

    @Override
    public Object box(int index, Object arg) {
        return TreeNode.from((Integer[]) arg);
    }

    @Test
    void test1() {
        Integer[] vals = new Integer[]{3, 9, 20, null, null, 15, 7};
        Integer[][] expected = new Integer[][]{{3}, {9, 20}, {15, 7}};
        super.test(expected, (Object) vals);
    }

    @Test
    void test2() {
        Integer[] vals = new Integer[]{1};
        Integer[][] expected = new Integer[][]{{1}};
        super.test(expected, (Object) vals);
    }

    @Test
    void test3() {
        Integer[] vals = new Integer[]{};
        Integer[][] expected = new Integer[][]{};
        super.test(expected, (Object) vals);
    }
}