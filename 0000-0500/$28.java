/**
 * Find the Index of the First Occurrence in a String.
 */
public class $28 {

    public int kmp(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        if (hLen < nLen) return -1;
        int[] pattern = new int[needle.length()];
        for (int i = 1, j = 0; i < nLen; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = pattern[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            pattern[i] = j;
        }
        for (int i = 0, j = 0; i < hLen; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pattern[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) return i - nLen + 1;
        }
        return -1;
    }

    public int bruteForce(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        for (int i = 0, j = 0; i + nLen <= hLen; i++, j = 0) {
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) return i;
        }
        return -1;
    }

}
