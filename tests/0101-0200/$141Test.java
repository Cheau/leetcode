import test.AbstractTest;
import test.ext.check.Result;
import linkedlist.single.ListNode;
import org.junit.jupiter.api.Test;

class $141Test extends AbstractTest implements Result {

    private int pos;

    @Override
    public Object box(int index, Object arg) {
        ListNode head = ListNode.from((int[]) arg);
        if (pos > -1) {
            ListNode target = head;
            for (int i = 0; i < pos; i++) {
                target = target.next;
            }
            ListNode tail = target;
            while (tail.next != null) tail = tail.next;
            tail.next = target;
        }
        return head;
    }

    @Test
    void test1() {
        pos = 1;
        super.test(true, (Object) new int[] {3, 2, 0, -4});
    }

    @Test
    void test2() {
        pos = 0;
        super.test(true, (Object) new int[] {1, 2});
    }

    @Test
    void test3() {
        pos = -1;
        super.test(false, (Object) new int[] {1});
    }

    @Test
    void test4() {
        pos = -1;
        super.test(false, (Object) new int[] {});
    }

}