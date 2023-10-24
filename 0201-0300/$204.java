import java.util.ArrayList;
import java.util.List;

/**
 * Count Primes.
 */
public class $204 {

    /**
     * 埃氏筛
     * @param n
     * @return primes count
     */
    public int eratosthenes(int n) {
        if (n < 3) return 0;
        boolean[] isNotPrime = new boolean[n / 2];
        int count = 1;
        int max = (int) Math.sqrt(n);
        for (int i = 3; i < n; i += 2) {
            if (!isNotPrime[i / 2]) {
                count++;
                if (i <= max) {
                    for (int j = i * i; j < n; j += i + i) {
                        isNotPrime[j / 2] = true;
                    }
                }
            }
        }
        return count;
    }

    /**
     * 线性筛
     * @param n
     * @return primes count
     */
    public int linear(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] isNotPrimes = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!isNotPrimes[i]) {
                primes.add(i);
            }
            int j = 0, product;
            while (j < primes.size()) {
                product = i * primes.get(j);
                if (product >= n) break;
                isNotPrimes[product] = true;
                if (i % primes.get(j) == 0) break;
                j++;
            }
        }
        return primes.size();
    }
}
