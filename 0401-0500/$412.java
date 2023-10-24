import java.util.Arrays;
import java.util.List;

/**
 * Fizz Buzz.
 */
public class $412 {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                answer[i - 1] = i % 5 == 0 ? "FizzBuzz" : "Fizz";
            } else if (i % 5 == 0) {
                answer[i - 1] = "Buzz";
            } else {
                answer[i - 1] = String.valueOf(i);
            }
        }
        return Arrays.asList(answer);
    }
}
