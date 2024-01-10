import org.junit.jupiter.api.Test;
import test.AbstractTest;
import test.ext.check.Result;

import static org.junit.jupiter.api.Assertions.*;

class $151Test extends AbstractTest implements Result {

    @Test
    void  test1() {
        super.test("blue is sky the", "the sky is blue");
    }

    @Test
    void  test2() {
        super.test("world hello", "  hello world  ");
    }

    @Test
    void  test3() {
        super.test("example good a", "a good   example");
    }

}