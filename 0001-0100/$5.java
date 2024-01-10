/**
 * Longest Palindromic Substring.
 */
public class $5 {
    private String longestPalindrome(String s) {
        return "";
    }

    public String bruteForce(String s) {
        int start = 0, end = -1;
        char[] chars = s.toCharArray();
        for (int left = 0; left < chars.length; left++) {
            for (int right = chars.length - 1; left <= right; right--) {
                int offset = 0;
                while (left + offset <= right - offset && chars[left + offset] == chars[right - offset]) {
                    offset++;
                }
                if (left + offset > right - offset && right - left > end - start) {
                    start = left;
                    end = right;
                    break;
                }
            }
        }
        return s.substring(start, end + 1);
    }

    public String dp(String s) {
        int strLength = s.length();
        if (strLength < 2) return s;
        boolean[][] dp = new boolean[strLength][strLength];
        for (int i = 0; i < strLength; i++) {
            dp[i][i] = true;
        }
        int begin = 0;
        int maxLength = 1;
        char[] chars = s.toCharArray();
        for (int len = 2; len <= strLength; len++) {
            for (int i = 0; i <= strLength - len; i++) {
                int j = i + len - 1;
                if (chars[i] != chars[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3)  {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && len > maxLength) {
                    maxLength = len;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLength);
    }

    public String expandAroundCenter(String s) {
        if (s.length() < 2) return s;
        char[] chars = s.toCharArray();
        int begin = 0, end = 1;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(chars, i, i);
            int len2 = expandAroundCenter(chars, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - begin) {
                begin = i - (len - 1) / 2;
                end = begin + len;
            }
        }
        return s.substring(begin, end);
    }

    private int expandAroundCenter(char[] chars, int left, int right) {
        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public String memoize(String s) {
        String polyfilled = polyfill(s);
        return null;
    }

    private String polyfill(String s) {
        StringBuffer sb = new StringBuffer("#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append("#");
        }
        return sb.toString();
    }
}
