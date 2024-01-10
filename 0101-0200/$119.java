import java.util.Arrays;
import java.util.List;

/**
 * Pascal's Triangle II.
 * <br>
 * <a href="https://leetcode.cn/problems/pascals-triangle-ii/solutions/601082/yang-hui-san-jiao-ii-by-leetcode-solutio-shuk/">Explanation</a>
 */
public class $119 {

    public List<Integer> byCalculation(int rowIndex) {
        Integer[] array = new Integer[rowIndex + 1];
        array[0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            array[i] = (int) ((long) array[i - 1] * (rowIndex - i + 1) / i);
        }
        return Arrays.asList(array);
    }

    public List<Integer> byIteration(int rowIndex) {
        Integer[] array = new Integer[rowIndex + 1];
        array[0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            array[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                array[j] = array[j - 1] + array[j];
            }
        }
        return Arrays.asList(array);
    }
}
