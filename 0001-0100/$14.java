/**
 * Longest Common Prefix.
 */
public class $14 {

    public String hScan(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        char[] prefix = strs[strs.length - 1].toCharArray();
        int i = prefix.length;
        for (String s : strs) {
            if (i > s.length()) i = s.length();
            for (int j = i - 1; j >= 0; j--) {
                if (prefix[j] != s.charAt(j)) i = j;
            }
            if (i == 0) return "";
        }
        return String.valueOf(prefix, 0, i);
    }

    public String vScan(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int i = -1, n = strs[0].length() - 1;
        while (i < n) {
            i++;
            for (String s : strs) {
                if (i == s.length() || strs[0].charAt(i) != s.charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i + 1);
    }
}
