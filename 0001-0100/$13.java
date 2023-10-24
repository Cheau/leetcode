/**
 * Roman to Integer.
 */
public class $13 {

    public int romanToInt(String s) {
        int sum = 0;
        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> sum += 1;
                case 'V' -> sum += prev == 'I' ? 3 : 5;
                case 'X' -> sum += prev == 'I' ? 8 : 10;
                case 'L' -> sum += prev == 'X' ? 30 : 50;
                case 'C' -> sum += prev == 'X' ? 80 : 100;
                case 'D' -> sum += prev == 'C' ? 300 : 500;
                case 'M' -> sum += prev == 'C' ? 800 : 1000;
                default -> {
                }
            }
            prev = s.charAt(i);
        }
        return sum;
    }

}
