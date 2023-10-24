import java.util.LinkedList;
import java.util.Queue;

import tree.binary.TreeNode;

/**
 * Maximum Depth of Binary Tree.
 */
public class $104 {

    public int dfs(TreeNode root) {
        return root == null ? 0 : (Math.max(dfs(root.left), dfs(root.right)) + 1);
    }

    public int bfs(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode head = queue.poll();
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
                size--;
            }
            depth++;
        }
        return depth;
    }
}
