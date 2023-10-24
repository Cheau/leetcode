import linkedlist.single.ListNode;

import java.util.Stack;

/**
 * Remove Nth Node from End of List.
 */
public class $19 {

    public ListNode byGappedPointers(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode former = head, latter = dummy;
        for (int i = 1; i < n; i++) former = former.next;
        while (former.next != null) {
            former = former.next;
            latter = latter.next;
        }
        latter.next = latter.next.next;
        return dummy.next;
    }

    public ListNode byFixedQueue(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int capacity = n + 1;
        ListNode[] index = new ListNode[capacity];
        ListNode node = dummy;
        int i = 0;
        do {
            index[i] = node;
            node = node.next;
            i = ++i % capacity;
        } while (node != null);
        node = index[i];
        node.next = node.next.next;
        return dummy.next;
    }

    public ListNode byLength(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = 1;
        while (head.next != null) {
            head = head.next;
            length++;
        }
        ListNode node = dummy;
        for (int i = 1; i < length - n + 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        return dummy.next;
    }

    public ListNode byStack(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Stack<ListNode> stack = new Stack<>();
        ListNode node = dummy;
        do {
            stack.push(node);
            node = node.next;
        } while (node != null);
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        node = stack.peek();
        node.next = node.next.next;
        return dummy.next;
    }
}
