/**
 * Plus One.
 */
public class $66 {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n - 1;
        do {
            if (digits[i] != 9) {
                ++digits[i];
                return digits;
            }
            digits[i--] = 0;
        } while (i >= 0);
        // All digits are 9.
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

}
