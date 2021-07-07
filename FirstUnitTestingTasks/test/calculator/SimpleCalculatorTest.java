package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void divByZero() {
        assertThrows(ArithmeticException.class, () -> SimpleCalculator.div(1, 0));
    }

    @Test
    void divNotByZero() {
        assertEquals(0, SimpleCalculator.div(1, 2));
    }
}