/**
 * First Unique Character in a String.
 */
public class $387 {

    public int bySearch(String s) {
        int min = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c += 1) {
            int first = s.indexOf(c);
            if (first != -1 && first == s.lastIndexOf(c)) {
                min = first < min ? first : min;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public int byCount(String s) {
        int[] count = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
