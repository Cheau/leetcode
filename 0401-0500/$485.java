/**
 * Max Consecutive Ones.
 */
public class $485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int n : nums) {
            if (n == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }

    public int twoPointers(int[] nums) {
        int maxCount = 0;
        for (int i = 0; i < nums.length;) {
            int j = i;
            while (j < nums.length && nums[j] == 1) j++;
            maxCount = Math.max(maxCount, j - i);
            i = j + 1;
        }
        return maxCount;
    }
}
