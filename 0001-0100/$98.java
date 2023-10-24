import java.util.Stack;

import tree.binary.TreeNode;

/**
 * Validate Binary Search Tree.
 */
public class $98 {

    private boolean recurse(TreeNode node, TreeNode min, TreeNode max) {
        if (node == null) return true;
        if (min != null && node.val <= min.val) return false;
        if (max != null && node.val >= max.val) return false;
        return recurse(node.left, min, node) && recurse(node.right, node, max);
    }

    public boolean recurse(TreeNode root) {
        return recurse(root.left, null, root) && recurse(root.right, root, null);
    }

    public boolean inorderTraverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Integer inorder = null;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (inorder != null && root.val <= inorder) return false;
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
