import tree.binary.TreeNode;

/**
 * Convert Sorted Array to Binary Search Tree.
 */
public class $108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (start + end + 1) / 2;
        TreeNode left = sortedArrayToBST(nums, start, mid - 1);
        TreeNode right = sortedArrayToBST(nums, mid + 1, end);
        return new TreeNode(nums[mid], left, right);
    }
}
