import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import tree.binary.TreeNode;

/**
 * Binary Tree Level Order Traversal.
 */
public class $102 {

    public List<List<Integer>> recurse(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        recurse(lists, root, 0);
        return lists;
    }

    private void recurse(List<List<Integer>> lists, TreeNode node, int level) {
        if (node == null) return;
        if (lists.size() <= level) lists.add(new LinkedList<>());
        List<Integer> list = lists.get(level);
        list.add(node.val);
        ++level;
        if (node.left != null) recurse(lists, node.left, level);
        if (node.right != null) recurse(lists, node.right, level);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) return lists;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        do {
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            do {
                TreeNode node = queue.remove();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            } while (--size > 0);
            lists.add(list);
        } while (queue.size() > 0);
        return lists;
    }
}
