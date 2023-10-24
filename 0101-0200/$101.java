import java.util.Deque;
import java.util.LinkedList;

import tree.binary.TreeNode;

/**
 * Symmetric Tree.
 */
public class $101 {

    public boolean recurse(TreeNode root) {
        return recurse(root, root);
    }

    private boolean recurse(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return recurse(left.left, right.right) && recurse(left.right, right.left);
    }

    public boolean iterate(TreeNode root) {
        return iterate(root, root);
    }

    private boolean iterate(TreeNode left, TreeNode right) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(left);
        queue.offer(right);
        do {
            left = queue.poll();
            right = queue.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null || left.val != right.val) return false;
            queue.push(left.left);
            queue.push(right.right);
            queue.push(left.right);
            queue.push(right.left);
        } while (!queue.isEmpty());
        return true;
    }
}
