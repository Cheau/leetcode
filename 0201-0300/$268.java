import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Missing Number.
 */
public class $268 {
    public int bySort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) return i;
        }
        return nums.length;
    }

    public int bySet(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) return i;
        }
        return 0;
    }

    public int byBit(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        for (int i = 0; i <= nums.length; i++) {
            diff ^= i;
        }
        return diff;
    }

    public int byMath(int[] nums) {
        int diff = (nums.length + 1) * nums.length / 2;
        for (int num : nums) {
            diff -= num;
        }
        return diff;
    }
}
