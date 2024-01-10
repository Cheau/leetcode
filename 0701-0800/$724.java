/**
 * Find Pivot Index.
 */
public class $724 {

    /**
     * rSum = total - lSum - pivot = lSum => 2 * lSum + pivot = total
     * @param nums numbers
     * @return pivot index
     */
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        for (int i = 0, lSum = 0; i < nums.length; i++) {
            if (2 * lSum + nums[i] == total) return i;
            lSum += nums[i];
        }
        return -1;
    }
}
