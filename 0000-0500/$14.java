/**
 * Longest Common Prefix.
 */
public class $14 {

    public String longestCommonPrefix(String[] strs) {
        int count = Integer.MAX_VALUE;
        String prefix = "";
        for (String s : strs) {
            if (s.length() < count) {
                count = s.length();
                prefix = s;
            }
        }
        if (count == 0) return "";
        char[] chars = prefix.toCharArray();
        for (String s : strs) {
            for (int i = count - 1; i >= 0; i--) {
                if (chars[i] != s.charAt(i)) {
                    count = i;
                }
            }
            if (count == 0) break;
        }
        return String.valueOf(chars, 0, count);
    }

    public String compare(String[] strs) {
        int end = -1, current = 0, n = strs.length;
        for (int i = 1; current < strs[0].length(); i = 1, current++) {
            char c = strs[0].charAt(current);
            while (i < n && current < strs[i].length() && c == strs[i].charAt(current)) i++;
            if (i != n) break;
            end = current;
        }
        return end == -1 ? "" : strs[0].substring(0, current);
    }
}
