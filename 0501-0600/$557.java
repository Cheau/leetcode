/**
 * Reverse Words in a String III
 */
public class $557 {

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        for (int head = 0, tail; head < chars.length;) {
            tail = head + 1;
            while (tail < chars.length && chars[tail] != ' ') tail++;
            reverseWord(chars, head, tail - 1);
            head = tail + 1;
        }
        return new String(chars);
    }

    private void reverseWord(char[] chars, int head, int tail) {
        while (head < tail) {
            char c = chars[head];
            chars[head++] = chars[tail];
            chars[tail--] = c;
        }
    }
}
