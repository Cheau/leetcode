import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

import java.util.List;

class $412Test extends AbstractTest implements Result {

    @Override
    @SuppressWarnings("unchecked")
    public Object unbox(Object result) {
        return ((List<String>) result).toArray();
    }

    @Test
    void test1() {
        super.test(new String[]{"1", "2", "Fizz"}, 3);
    }

    @Test
    void test2() {
        super.test(new String[]{"1", "2", "Fizz", "4", "Buzz"}, 5);
    }

    @Test
    void test3() {
        super.test(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, 15);
    }

}