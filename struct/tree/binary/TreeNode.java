package tree.binary;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode from(Integer[] vals) {
        int n = vals.length;
        if (n == 0) return null;
        TreeNode[] nodes = new TreeNode[n];
        for (int i = n - 1; i >= 0; i--) {
            if (vals[i] == null) continue;
            int j = 2 * i + 1;
            TreeNode left = j >= n ? null : nodes[j];
            TreeNode right = ++j >= n ? null : nodes[j];
            nodes[i] = new TreeNode(vals[i], left, right);
        }
        return nodes[0];
    }

    /**
     * Breadth First Search.
     * @return The traversing value array.
     */
    public Integer[] bfs() {
        Deque<Integer> values = new LinkedList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(this);
        do {
            TreeNode node = nodes.poll();
            if (node == null) {
                values.add(null);
                continue;
            }
            values.add(node.val);
            nodes.add(node.left);
            nodes.add(node.right);
        } while (nodes.size() > 0);
        while (values.getLast() == null) values.removeLast();
        return values.toArray(new Integer[0]);
    }
}
