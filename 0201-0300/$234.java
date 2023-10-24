import linkedlist.single.ListNode;

/**
 * Palindrome Linked List.
 */
public class $234 {

    public boolean index(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        if (length < 2) return true;
        int[] array = new int[(length + 1) / 2];
        node = head;
        for (int i = 0; i < array.length; i++) {
            array[i] = node.val;
            node = node.next;
        }
        for (int i = array.length - 1 - length % 2; i >= 0; i--) {
            if (array[i] != node.val) return false;
            node = node.next;
        }
        return true;
    }

    public boolean fastSlowPointers(ListNode head) {
        ListNode fast = head.next, tail, slow = head;
        if (fast == null) return true;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        tail = null;
        while (fast != null) {
            slow = fast;
            fast = fast.next;
            slow.next = tail;
            tail = slow;
        }
        slow = null;
        boolean isPalindrome = true;
        while (tail != null) {
            if (head.val != tail.val) isPalindrome = false;
            head = head.next;
            fast = tail.next;
            tail.next = slow;
            slow = tail;
            tail = fast;
        }
        return isPalindrome;
    }

    public boolean recurse(ListNode head) {
        ListNode node = new ListNode(0, head);
        return recurse(node, head.next);
    }

    private boolean recurse(ListNode head, ListNode node) {
        if (node == null) return true;
        if (recurse(head, node.next)) {
            if (head.next == null) return true;
            boolean result = head.next.val == node.val;
            head.next = head.next.next;
            if (head.next == node || head.next.next == node) head.next = null;
            return result;
        }
        return false;
    }
}
