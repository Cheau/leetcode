import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicate.
 */
public class $217 {

    public boolean byInsertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > current) nums[j + 1] = nums[j];
                else break;
            }
            if (j >= 0 && nums[j] == current) return true;
            nums[j + 1] = current;
        }
        return false;
    }

    public boolean bySet(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int n : nums) {
            if (!set.add(n)) return true;
        }
        return false;
    }

    public boolean byQuickSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) return true;
        }
        return false;
    }
}
