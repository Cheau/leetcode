/**
 * Reverse Integer.
 */
public class $7 {

    public int reverse(int x) {
        int result = 0;
        int min = Integer.MIN_VALUE / 10;
        int max = Integer.MAX_VALUE / 10;
        while (x != 0) {
            if (result < min || result > max) return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
