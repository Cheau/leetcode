import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;
import tree.binary.TreeNode;

class $101Test extends AbstractTest implements Result {

    @Override
    public Object box(int index, Object arg) {
        return TreeNode.from((Integer[]) arg);
    }

    @Test
    void test1() {
        super.test(true, (Object) new Integer[] {1, 2, 2, 3, 4, 4, 3});
    }

    @Test
    void test2() {
        super.test(false, (Object) new Integer[] {1, 2, 2, null, 3, null, 3});
    }

}