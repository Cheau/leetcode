import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $384Test extends AbstractTest<$384> implements Result<$384> {

    private final int[] original = new int[] {1, 2, 3};
    private final int[] nums = Arrays.copyOf(original, original.length);

    @Override
    public $384 getTarget() {
        return new $384(nums);
    }

    private Map<Integer, Integer[]> newCounter() {
        int n = nums.length;
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), (num) -> {
                    Integer[] array = new Integer[n];
                    Arrays.fill(array, 0);
                    return array;
                }));
    }

    @Test
    void test1() {
        $384 target = getTarget();
        int times = 9999;
        int n = nums.length;
        Map<Integer, Integer[]> counter = newCounter();
        for (int i = 0; i < times; i++) {
            check(original, null, target.reset());
            int[] result = target.shuffle();
            for (int j = 0; j < n; j++) {
                Integer[] array = counter.get(result[j]);
                array[j] += 1;
                counter.put(result[j], array);
            }
        }
        int avg = times / n;
        counter.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .forEach(e -> {
                    Integer[] array = e.getValue();
                    for (int i = 0; i < n; i++) {
                        array[i] -= avg;
                    }
                    System.out.println(e.getKey() + ": " + Arrays.toString(array));
                });
    }
}