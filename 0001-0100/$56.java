import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Merge Intervals.
 */
public class $56 {

    public int[][] compare(int[][] intervals) {
        if (intervals.length < 2) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int min = intervals[i][0], max = intervals[i][1];
            if (merged.get(merged.size() - 1)[1] < min) {
                merged.add(intervals[i]);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], max);
            }
        }
        return merged.toArray(new int[0][]);
    }

    public int[][] count(int[][] intervals) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            min = Math.min(min, interval[0]);
            max = Math.max(max, interval[1]);
        }
        int[] mins = new int[max + 1];
        int[] maxs = new int[mins.length];
        for (int[] interval : intervals) {
            mins[interval[0]]++;
            maxs[interval[1]]++;
        }
        List<int[]> merged = new ArrayList<>();
        int start = -1, count = 0;
        for (int i = 0; i < mins.length; i++) {
            if (mins[i] > 0) {
                if (count == 0) {
                    start = i;
                }
                count += mins[i];
            }
            if (maxs[i] > 0) {
                count -= maxs[i];
                if (count == 0) {
                    merged.add(new int[] {start, i});
                }
            }
        }
        return merged.toArray(new int[0][]);
    }
}
