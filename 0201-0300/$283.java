/**
 * Move Zeroes.
 */
public class $283 {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int fast = 0, slow = 0; fast < n; fast++) {
            if (nums[fast] != 0) {
                if (fast > slow) {
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                }
                slow++;
            }
        }
    }

}
