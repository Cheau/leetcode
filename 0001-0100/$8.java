/**
 * String to Integer (atoi).
 */
public class $8 {

    public int myAtoi(String s) {
        int result = 0;
        int n = s.length();
        int i = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return result;
        boolean negative = false;
        switch (s.charAt(i)) {
            case '-':
                negative = true;
            case '+':
                i++;
                break;
            default:
                if (s.charAt(i) < '0' || s.charAt(i) > '9') return result;
        }
        int maxRange = Integer.MAX_VALUE / 10;
        char maxDigit = negative ? '8' : '7';
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (result > maxRange || (result == maxRange && s.charAt(i) >= maxDigit)) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + s.charAt(i++) - '0';
        }
        return negative ? -result : result;
    }
}
