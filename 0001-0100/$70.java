/**
 * Climbing Stairs.
 */
public class $70 {

    public int iterate(int n) {
        int last = 1, current = 1;
        for (int i = 1; i < n; i++) {
            int tmp = last + current;
            last = current;
            current = tmp;
        }
        return current;
    }

    public int recurse(int n) {
        if (n < 3) return n;
        return recurse(n - 1) + recurse(n - 2);
    }
}
