/**
 * Reverse String.
 */
public class $344 {

    public void reverseString(char[] s) {
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
        }
    }
}
