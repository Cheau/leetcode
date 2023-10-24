/**
 * Power of Three.
 */
public class $326 {
    public boolean divide(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public boolean isDivisor(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
