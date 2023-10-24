/**
 * Valid Parentheses
 */
class $20 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) return false;
        char[] stack = new char[n / 2];
        int head = -1;
        Character peek;
        for (int i = 0; i < n; i++) {
            peek = switch (s.charAt(i)) {
                case ')' -> '(';
                case ']' -> '[';
                case '}' -> '{';
                default -> null;
            };
            if (peek == null) {
                if (++head == stack.length) return false;
                stack[head] = s.charAt(i);
            } else if (head == -1 || stack[head--] != peek) {
                return false;
            }
        }
        return head == -1;
    }
}
