import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Intersection of Two Arrays II.
 */
public class $350 {

    public int[] bySorting(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int[] intersection = new int[Math.min(length1, length2)];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] == nums2[index2]) {
                intersection[index++] = nums1[index1];
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

    public int[] byMap(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return byMap(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int i = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                nums1[i++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                    if (map.size() == 0) break;
                }
            }
        }
        return Arrays.copyOfRange(nums1, 0, i);
    }

}
