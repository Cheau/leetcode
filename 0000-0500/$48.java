/**
 * Rotate Image.
 */
public class $48 {

    private void swapDiagonally(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < n; i++) {
            int col = n - i;
            for (int j = 0; j < col; j++) {
                int row = n - j;
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    private void swapVertically(int[][] matrix) {
        int n = matrix.length - 1;
        int half = n / 2;
        for (int i = 0; i <= half; i++) {
            int row = n - i;
            for (int j = 0; j <= n; j++) {
                int tmp = matrix[row][j];
                matrix[row][j] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        if (matrix.length == 1) return;
        swapDiagonally(matrix);
        swapVertically(matrix);
    }

}
