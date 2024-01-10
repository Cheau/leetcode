import java.util.Arrays;

/**
 * Set Matrix Zeroes.
 */
public class $73 {

    public void markByTwoArrays(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length], cols = new boolean[matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) {
                    rows[row] = cols[col] = true;
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (rows[row] || cols[col]) {
                    matrix[row][col] = 0;
                }
            }
        }
    }

    public void markByTwoVars(int[][] matrix) {
        boolean isRow0Zero = false, isCol0Zero = false;
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                isRow0Zero = true;
                break;
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                isCol0Zero = true;
                break;
            }
        }
        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = matrix[0][col] = 0;
                }
            }
        }
        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[row].length; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }
        if (isRow0Zero) Arrays.fill(matrix[0], 0);
        if (isCol0Zero) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][0] = 0;
            }
        }
    }

    public void markByOneVar(int[][] matrix) {
        boolean isCol0Zero = false;
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) isCol0Zero = true;
            for (int col = 1; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) matrix[row][0] = matrix[0][col] = 0;
            }
        }
        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = 1; col < matrix[row].length; col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
            if (isCol0Zero) matrix[row][0] = 0;
        }
    }
}
