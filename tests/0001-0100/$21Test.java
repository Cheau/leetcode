import test.AbstractTest;
import test.ext.check.Result;
import linkedlist.single.ListNode;
import org.junit.jupiter.api.Test;
import test.ext.unboxing.Listable;

class $21Test extends AbstractTest implements Result, Listable {

    @Override
    public Object box(int index, Object arg) {
        if (index < 2) return ListNode.from((int[]) arg);
        return super.box(index, arg);
    }

    @Test
    void test1() {
        int[] vals1 = {1, 2, 4};
        int[] vals2 = {1, 3, 4};
        super.test(new int[]{1, 1, 2, 3, 4, 4}, vals1, vals2);
    }

    @Test
    void test2() {
        int[] vals1 = {};
        int[] vals2 = {};
        super.test(new int[]{}, vals1, vals2);
    }

    @Test
    void test3() {
        int[] vals1 = {};
        int[] vals2 = {0};
        super.test(new int[]{0}, vals1, vals2);
    }

}