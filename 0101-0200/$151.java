import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Reverse Words in a String.
 */
public class $151 {

    public String reverseOnce(String s) {
        char[] original = s.toCharArray();
        char[] reversal = new char[original.length];
        int wordEnd = original.length - 1, count = 0;
        while (wordEnd >= 0) {
            while (wordEnd >= 0 && original[wordEnd] == ' ') wordEnd--;
            if (wordEnd < 0) break;
            int wordStart = wordEnd - 1;
            while (wordStart >= 0 && original[wordStart] != ' ') wordStart--;
            if (count > 0) reversal[count++] = ' ';
            System.arraycopy(original, wordStart + 1, reversal, count, wordEnd - wordStart);
            count += wordEnd - wordStart;
            wordEnd = wordStart - 1;
        }
        return new String(reversal, 0, count);
    }

    public String reverseTwiceInArray(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        reverse(chars, left, left, right);
        int pointer = 0;
        while (right < chars.length) {
            while (left < chars.length && chars[left] == ' ') left++;
            if (left == chars.length) break;
            right = left + 1;
            while (right < chars.length && chars[right] != ' ') right++;
            pointer = reverse(chars, pointer, left, right - 1);
            left = right + 1;
        }
        return new String(chars, 0, pointer);
    }

    private int reverse(char[] chars, int pointer, int left, int right) {
        if (pointer > 0) chars[pointer++] = ' ';
        int max = right;
        while (left < right) {
            char c = chars[left++];
            chars[pointer++] = chars[right];
            chars[right--] = c;
        }
        while (left <= max) {
            chars[pointer++] = chars[left++];
        }
        return pointer;
    }

    public String reverseTwiceInStringBuilder(String s) {
        StringBuilder sb = reverseAndTrim(s);
        int n = sb.length();
        for (int left = 0, right; left < n;) {
            right = left + 1;
            while (right < n && sb.charAt(right) != ' ') right++;
            reverseWord(sb, left, right - 1);
            left = right + 1;
        }
        return sb.toString();
    }

    private StringBuilder reverseAndTrim(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        do {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (sb.length() > 0 && i >= 0) sb.append(' ');
            while (i >= 0 && s.charAt(i) != ' ') sb.append(s.charAt(i--));
        } while (i >= 0);
        return sb;
    }

    private void reverseWord(StringBuilder sb, int left, int right) {
        while (left < right) {
            char c = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, c);
        }
    }

    public String reverseByApi(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
