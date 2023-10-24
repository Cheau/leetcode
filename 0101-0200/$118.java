import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Pascal's Triangle.
 */
class $118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>(numRows);
        int[] array = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            LinkedList<Integer> row = new LinkedList<>();
            for (int j = i; j >= 0; j--) {
                if (j == 0 || j == i) {
                    array[j] = 1;
                } else {
                    array[j] = array[j - 1] + array[j];
                }
                row.addFirst(array[j]);
            }
            rows.add(row);
        }
        return rows;
    }
}
