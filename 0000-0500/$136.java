import java.util.HashSet;
import java.util.Set;

/**
 * Single Number.
 */
public class $136 {

    public int byXor(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public int byCounting(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int min = nums[0];
        int max = min;
        for (int num : nums) {
            if (num < min) min = num;
            else if (num > max) max = num;
        }
        int k = max - min + 1;
        int[] counter = new int[k];
        for (int num : nums) {
            counter[num - min] += 1;
        }
        for (int i = 0; i < k; i++) {
            if (counter[i] == 1) return min + i;
        }
        return 0;
    }

    public int bySet(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) set.remove(num);
        }
        return (int) set.toArray()[0];
    }
}
