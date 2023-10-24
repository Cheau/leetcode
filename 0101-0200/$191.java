/**
 * Hamming Weight.
 */
public class $191 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) count++;
            n = n >>> 1;
        }
        return count;
    }

    public int byBit(int n) {
        n = (n & 0x55555555) + (n >>> 1 & 0x55555555);
        n = (n & 0x33333333) + (n >>> 2 & 0x33333333);
        n = (n & 0x0f0f0f0f) + (n >>> 4 & 0x0f0f0f0f);
        n = (n & 0x00ff00ff) + (n >>> 8 & 0x00ff00ff);
        return (n & 0x0000ffff) + (n >>> 16 & 0x0000ffff);
    }

    public int byJdk(int n) {
        return Integer.bitCount(n);
    }
}
