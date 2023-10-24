import test.AbstractTest;
import test.ext.check.Result;
import linkedlist.single.ListNode;
import org.junit.jupiter.api.Test;
import test.ext.unboxing.Listable;

class $206Test extends AbstractTest implements Listable, Result {

    @Override
    public Object box(int index, Object arg) {
        if (index == 0) return ListNode.from((int[]) arg);
        return super.box(index, arg);
    }

    @Test
    void test1() {
        int[] vals = {1, 2, 3, 4, 5};
        super.test(new int[] {5, 4, 3, 2, 1}, vals);
    }

    @Test
    void test2() {
        int[] vals = {1, 2};
        super.test(new int[] {2, 1}, (Object) vals);
    }

    @Test
    void test3() {
        int[] vals = {};
        super.test(new int[] {}, (Object) vals);
    }

    @Test
    void test4() {
        int[] vals = {1};
        super.test(new int[] {1}, (Object) vals);
    }

}