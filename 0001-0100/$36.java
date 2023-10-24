import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Valid Sudoku.
 */
public class $36 {

    private boolean isInvalid(char[] chars) {
        boolean[] marks = new boolean[9];
        int i;
        for (char c : chars) {
            if (c == '.') continue;
            i = c - '1';
            if (marks[i]) return true;
            marks[i] = true;
        }
        return false;
    }

    public boolean byBruteForce(char[][] board) {
        for (int row = 0; row < 9; row++) {
            if (isInvalid(board[row])) return false;
        }
        char[] chars = new char[9];
        for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 9; row++) {
                chars[row] = board[row][col];
            }
            if (isInvalid(chars)) return false;
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int k = 0;
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        chars[k++] = board[row][col];
                    }
                }
                if (isInvalid(chars)) return false;
            }
        }
        return true;
    }

    public boolean byHash(char[][] board) {
        Map<Integer, Set<Integer>> rows = new HashMap<>();
        Map<Integer, Set<Integer>> cols = new HashMap<>();
        Map<Integer, Set<Integer>> subs = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
            subs.put(i, new HashSet<>());
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c == '.') continue;
                int n = c - '0';
                int sub = row / 3 * 3 + col / 3;
                if (rows.get(row).contains(n) || cols.get(col).contains(n) || subs.get(sub).contains(n)) {
                    return false;
                }
                rows.get(row).add(n);
                cols.get(col).add(n);
                subs.get(sub).add(n);
            }
        }
        return true;
    }

    public boolean byArray(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] subs = new int[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c == '.') continue;
                int n = c - '1';
                int sub = row / 3 * 3 + col / 3;
                if (rows[row][n] == 1 || cols[col][n] == 1 || subs[sub][n] == 1) return false;
                rows[row][n] = cols[col][n] = subs[sub][n] = 1;
            }
        }
        return true;
    }

    public boolean byBitArray(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] subs = new int[9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c == '.') continue;
                int n = c - '0';
                int sub = row / 3 * 3 + col / 3;
                if ((rows[row] >> n & 1) == 1 || (cols[col] >> n & 1) == 1 || (subs[sub] >> n & 1) == 1) {
                    return false;
                }
                rows[row] |= 1 << n;
                cols[col] |= 1 << n;
                subs[sub] |= 1 << n;
            }
        }
        return true;
    }

}
