import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum.
 */
public class $1 {

    public int[] byLoop(int[] nums, int target) {
        int head = 0, tail = nums.length - 1;
        do {
            if (nums[head] + nums[tail] == target) {
                return new int[] {head, tail};
            }
            for (int i = head + 1; i < tail; i++) {
                if (nums[head] + nums[i] == target) {
                    return new int[] {head, i};
                }
                if (nums[i] + nums[tail] == target) {
                    return new int[] {i, tail};
                }
            }
        } while (++head < --tail);
        return new int[] {0};
    }

    public int[] byMap(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[] {0};
    }

}
