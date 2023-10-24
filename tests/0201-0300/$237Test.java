import linkedlist.single.ListNode;
import org.junit.jupiter.api.Test;
import test.AbstractTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class $237Test extends AbstractTest {

    private ListNode head;

    @Override
    public void check(Object expected, Object[] args, Object result) {
        int[] vals = (int[]) expected;
        ListNode node = head;
        for (int i = 0; i < vals.length; i++, node = node.next) {
            assertNotNull(node);
            assertEquals(vals[i], node.val);
        }
    }

    @Test
    void test1() {
        int[] vals = {4, 5, 1, 9};
        head = ListNode.from(vals);
        super.test(new int[]{4, 1, 9}, head.next);
    }

    @Test
    void test2() {
        int[] vals = {4, 5, 1, 9};
        head = ListNode.from(vals);
        super.test(new int[]{4, 5, 9}, head.next.next);
    }
}