import java.util.Random;

/**
 * Shuffle an Array.
 */
public class $384 {

    private final int[] nums;
    private final int[] original;
    private final Random random = new Random();

    public $384(int[] nums) {
        this.nums = nums;
        original = new int[nums.length];
        System.arraycopy(nums, 0, original, 0, nums.length);
    }

    public int[] reset() {
        System.arraycopy(original, 0, nums, 0, original.length);
        return nums;
    }

    public int[] shuffle() {
        for (int i = nums.length; i > 1;) {
            int j = random.nextInt(i--);
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
