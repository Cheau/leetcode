import linkedlist.single.ListNode;

/**
 * Merge Two Sorted Lists.
 */
public class $21 {

    public ListNode iterate(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(), current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 == null ? list2 : list1;
        return dummy.next;
    }

    public ListNode recurse(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = recurse(list1.next, list2);
            return list1;
        }
        list2.next = recurse(list1, list2.next);
        return list2;
    }
}
