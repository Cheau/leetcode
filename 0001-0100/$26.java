/**
 * Remove Duplicates from Sorted Array.
 */
public class $26 {

    public int removeDuplicates(int[] nums) {
        int fast = 0, slow = 0;
        while (++fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
