/**
 * Diagonal Traverse.
 */
public class $498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] diagonal = new int[m * n];
        int i = 0, row = 0, col = 0, offsetRow = -1, offsetCol = 1;
        while (i < diagonal.length) {
            diagonal[i++] = mat[row][col];
            row += offsetRow;
            col += offsetCol;
            if (row < 0 || row == m || col < 0 || col == n) {
                offsetRow = -offsetRow;
                offsetCol = -offsetCol;
            }
            if (row < 0 && col < n) {
                row += 1;
            } else if (row == m && col < n) {
                row -= 1;
                col += 2;
            } else if (col < 0 && row < m) {
                col += 1;
            } else if (col == n) {
                row += 2;
                col -= 1;
            }
        }
        return diagonal;
    }

    public int[] calcByDiagonalLine(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] diagonal = new int[m * n];
        for (int i = 0, line = 1; i < diagonal.length; line++) {
            if (line % 2 == 1) {
                int row = line < m ? line - 1 : m - 1;
                int col = line < m ? 0 : line - m;
                while (row >= 0 && col < n) {
                    diagonal[i++] = mat[row--][col++];
                }
            } else {
                int row = line < n ? 0 : line - n;
                int col = line < n ? line - 1 : n - 1;
                while (row < m && col >= 0) {
                    diagonal[i++] = mat[row++][col--];
                }
            }
        }
        return diagonal;
    }
}
