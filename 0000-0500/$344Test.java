import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class $344Test extends AbstractTest<$344> {

    @Override
    protected void check(Object expected, Object[] args, Object result) {
        assertArrayEquals((char[]) expected, (char[]) args[0]);
    }

    @Test
    void test1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        super.test(expected, s);
    }

    @Test
    void test2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        super.test(expected, s);
    }
}
