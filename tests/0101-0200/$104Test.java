import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;
import tree.binary.TreeNode;

class $104Test extends AbstractTest implements Result {

    @Override
    public Object box(int index, Object arg) {
        return TreeNode.from((Integer[]) arg);
    }

    @Test
    void test1() {
        super.test(3, (Object) new Integer[]{3, 9, 20, null, null, 15, 7});
    }

    @Test
    void test2() {
        super.test(2, (Object) new Integer[]{1, null, 2});
    }

}