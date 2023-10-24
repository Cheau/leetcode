import linkedlist.single.ListNode;

/**
 * Reverse Linked List.
 */
public class $206 {

    public ListNode iterate(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            head = head.next;
            curr.next = prev;
            prev = curr;
            curr = head;
        }
        return prev;
    }

    public ListNode recurse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode result = recurse(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
}
