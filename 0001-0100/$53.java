/**
 * Maximum Subarray.
 */
public class $53 {

    public int dp(int[] nums) {
        int pre = 0, max = nums[0];
        for (int n : nums) {
            pre = Math.max(pre + n, n);
            max = Math.max(pre, max);
        }
        return max;
    }
}
