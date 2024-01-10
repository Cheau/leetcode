import java.util.Arrays;

/**
 * Array Partition.
 */
public class $561 {

    public int byBucketSort(int[] nums) {
        int min = nums[0], max = min;
        for (int num : nums) {
            if (num < min) min = num;
            else if (num > max) max = num;
        }
        int[] buckets = new int[max - min + 1];
        for (int num : nums) {
            buckets[num - min] += 1;
        }
        int sum = nums.length / 2 * min;
        for (int i = 0, j = 0; i < buckets.length; i++) {
            while (buckets[i]-- > 0) {
                nums[j++] = i;
            }
        }
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public int byQuickSort(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
