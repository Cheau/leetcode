import linkedlist.single.ListNode;

/**
 * Delete Node in a Linked List.
 */
public class $237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
