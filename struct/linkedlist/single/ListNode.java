package linkedlist.single;

import java.util.Arrays;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode from(int[] vals) {
        ListNode head = new ListNode();
        Arrays.stream(vals).mapToObj(ListNode::new).reduce(head, (current, node) -> {
            current.next = node;
            return node;
        });
        return head.next;
    }
}
