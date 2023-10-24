import test.AbstractTest;
import test.ext.check.Custom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class $155Test extends AbstractTest<$155> implements Custom<$155> {

    @Test
    void test1() {
        $155 target = getTarget();
        target.push(-2);
        target.push(0);
        target.push(-3);
        assertEquals(-3, target.getMin());
        target.pop();
        assertEquals(0, target.top());
        assertEquals(-2, target.getMin());
    }
}