package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    void sum() {
        assertEquals(0, SimpleCalculator.sum(1, -1));
    }

    @Test
    void sub() {
        assertEquals(0, SimpleCalculator.sub(1, 1));
    }

    @Test
    void mul() {
        assertEquals(0, SimpleCalculator.mul(1, 0));
    }

    @Test
    void div() {
        assertEquals(0, SimpleCalculator.div(1, 2));
    }
}