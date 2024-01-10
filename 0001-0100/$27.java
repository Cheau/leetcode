/**
 * Remove Element.
 */
public class $27 {

    public int scanTowards1(int[] nums, int val) {
        int low = 0;
        for (int high = nums.length; low < high;) {
            if (nums[high - 1] == val) {
                high--;
            } else if (nums[low] == val) {
                nums[low++] = nums[--high];
            } else {
                low++;
            }
        }
        return low;
    }

    public int scanTowards2(int[] nums, int val) {
        int low = 0;
        for (int high = nums.length; low < high;) {
            if (nums[low] == val) {
                nums[low] = nums[--high];
            } else {
                low++;
            }
        }
        return low;
    }

    public int scanSameDirection(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                if (slow != fast) nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
