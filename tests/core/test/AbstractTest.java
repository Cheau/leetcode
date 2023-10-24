package test;

import test.base.Testable;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class AbstractTest<T> implements Testable<T> {

    @BeforeAll
    public final void before() {
        setup();
    }

    protected void setup() {}
}
