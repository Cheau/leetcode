/**
 * Valid Palindrome.
 */
public class $125 {

    private char lowercase(char c) {
        return c >= 'A' && c <= 'Z' ? (char) (c + 32) : c;
    }

    private boolean isNotAlphanumeric(char c) {
        return c < '0' || (c > '9' && c < 'A') || (c > 'Z' && c < 'a') || c > 'z';
    }

    public boolean isPalindrome(String s) {
        char lChar, rChar;
        for (int left = 0, right = s.length() - 1; left < right; ) {
            lChar = s.charAt(left);
            if (isNotAlphanumeric(lChar)) {
                left++;
                continue;
            }
            rChar = s.charAt(right);
            if (isNotAlphanumeric(rChar)) {
                right--;
                continue;
            }
            if (lowercase(lChar) != lowercase(rChar)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
