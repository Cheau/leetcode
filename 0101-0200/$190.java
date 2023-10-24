/**
 * Reverse Bits.
 */
public class $190 {
    public int byLoop(int n) {
        int r = 0;
        for (int i = 0; i < Integer.SIZE && n != 0; i++) {
            r |= (n & 1) << (Integer.SIZE - i - 1);
            n >>>= 1;
        }
        return r;
    }

    public int byDivision(int n) {
        n = (n & 0x55555555) << 1 | n >>> 1 & 0x55555555;
        n = (n & 0x33333333) << 2 | n >>> 2 & 0x33333333;
        n = (n & 0x0f0f0f0f) << 4 | n >>> 4 & 0x0f0f0f0f;
        n = (n & 0x00ff00ff) << 8 | n >>> 8 & 0x00ff00ff;
        return (n & 0x0000ffff) << 16 | n >>> 16 & 0x0000ffff;
    }
}
