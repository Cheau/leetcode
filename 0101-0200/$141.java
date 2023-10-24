import java.util.HashSet;
import java.util.Set;

import linkedlist.single.ListNode;

/**
 * Linked List Cycle.
 */
public class $141 {

    public boolean fastSlowPointers(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head.next;
        while (slow != fast) {
            if (fast.next == null || fast.next.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public boolean hash(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}
