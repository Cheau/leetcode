/**
 * Minimum Size Subarray Sum.
 */
public class $209 {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int low = 0, high = 0, sum = 0; high < nums.length; high++) {
            sum += nums[high];
            while (sum >= target) {
                min = Math.min(min, high - low + 1);
                sum -= nums[low++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
