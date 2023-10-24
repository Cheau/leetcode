import test.AbstractTest;
import test.ext.check.Result;
import linkedlist.single.ListNode;
import org.junit.jupiter.api.Test;

class $234Test extends AbstractTest implements Result {

    @Override
    public Object box(int index, Object arg) {
        if (index == 0) return ListNode.from((int[]) arg);
        return super.box(index, arg);
    }

    @Test
    void test1() {
        super.test(true, (Object) new int[] {1, 2, 2, 1});
    }

    @Test
    void test2() {
        super.test(false, (Object) new int[] {1, 2});
    }

    @Test
    void test3() {
        super.test(true, (Object) new int[] {1, 2, 2, 2, 1});
    }

    @Test
    void test4() {
        super.test(true, (Object) new int[] {1, 2, 2, 2, 1});
    }

    @Test
    void test5() {
        super.test(false, (Object) new int[] {2, 2, 1, 2, 1, 1});
    }

    @Test
    void test6() {
        super.test(true, (Object) new int[] {0, 0});
    }

    @Test
    void test7() {
        super.test(true, (Object) new int[] {0});
    }

    @Test
    void test8() {
        super.test(false, (Object) new int[] {1, 1, 2, 1});
    }
}