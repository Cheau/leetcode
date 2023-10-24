import test.AbstractTest;
import test.ext.check.Result;
import test.ext.util.Cacheable;
import org.junit.jupiter.api.Test;

import java.util.Random;

class $191Test extends AbstractTest implements Cacheable, Result {

    @Test
    void test1() {
        super.test(3, 11);
    }

    @Test
    void test2() {
        super.test(1, 128);
    }

    @Test
    void test3() {
        super.test(31, -3);
    }

    @Test
    void test4() {
        Random r = new Random();
        for (int i = Integer.MIN_VALUE, j = 0; j < 10000; j++) {
            cache(Integer.bitCount(i), i);
            i += r.nextInt(0x0fffffff);
        }
        flush();
    }

}