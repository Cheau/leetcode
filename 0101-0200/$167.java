/**
 * Two Sum II - Input Array Is Sorted.
 */
public class $167 {

    public int[] twoPointersBinarySearch(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) break;
            if (sum > target) {
                high--;
            } else {
                low++;
            }
            sum = (low + high) >>> 1;
            if (numbers[low] + numbers[sum] > target) {
                high = sum - 1;
            } else if (numbers[sum] + numbers[high] < target) {
                low = sum + 1;
            }
        }
        return new int[] {low + 1, high + 1};
    }

    public int[] twoPointers(int[] numbers, int target) {
        for (int low = 0, high = numbers.length - 1; low < high;) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[] {low + 1, high + 1};
            }
            if (sum > target) {
                high--;
            } else {
                low++;
            }
        }
        return null;
    }

    public int[] binarySearch(int[] numbers, int target) {
        int[] indices = null;
        int edge = numbers.length;
        for (int i = 0; i < edge && indices == null; i++) {
            for (int mid = (i + edge) / 2; i < mid;) {
                int sum = numbers[i] + numbers[mid];
                if (sum == target) {
                    indices = new int[] {i + 1, mid + 1};
                    break;
                }
                if (sum > target) {
                    edge = mid;
                    mid = (i + edge) / 2;
                } else {
                    if (edge - mid == 1) break;
                    mid = (mid + edge) / 2;
                }
            }
        }
        return indices;
    }
}
