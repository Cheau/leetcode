import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;
import tree.binary.TreeNode;

class $98Test extends AbstractTest implements Result {

    @Override
    public Object box(int index, Object arg) {
        return TreeNode.from((Integer[]) arg);
    }

    @Test
    void test1() {
        super.test(true, (Object) new Integer[] {2, 1, 3});
    }

    @Test
    void test2() {
        super.test(false, (Object) new Integer[] {5, 1, 4, null, null, 3, 6});
    }

    @Test
    void test3() {
        super.test(false, (Object) new Integer[] {2, 2, 2});
    }

    @Test
    void test4() {
        super.test(false, (Object) new Integer[] {5, 4, 6, null, null, 3, 7});
    }

    @Test
    void test5() {
        super.test(true, (Object) new Integer[] {Integer.MIN_VALUE});
    }

}