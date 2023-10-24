/**
 * Min Stack.
 */
public class $155 {

    private Node head;

    public $155() {

    }

    public void push(int val) {
        Node node = new Node(val, head);
        head = node;
    }

    public void pop() {
        if (head != null) head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        private int min;
        private int val;
        private Node next;

        private Node(int val, Node next) {
            this.val = val;
            this.next = next;
            min = next != null && next.min < val ? next.min : val;
        }
    }
}
