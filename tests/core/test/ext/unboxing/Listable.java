package test.ext.unboxing;

import java.util.ArrayList;
import java.util.List;
import linkedlist.single.ListNode;
import test.base.Testable;

import static org.junit.jupiter.api.Assertions.assertTrue;

public interface Listable<T> extends Testable<T> {

    @Override
    default Object unbox(Object result) {
        if (result == null) return new int[] {};
        assertTrue(result instanceof ListNode, "The result is not of ListNode type!");
        ListNode node = (ListNode) result;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
