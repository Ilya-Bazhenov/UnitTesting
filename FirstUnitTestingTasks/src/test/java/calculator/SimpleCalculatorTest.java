package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleCalculatorTest {

    @Test
    void sum() {
        int actualAnswer = SimpleCalculator.sum(1, -1);

        assertEquals(0, actualAnswer);
    }

    @Test
    void sub() {
        int actualAnswer = SimpleCalculator.sub(1, 1);

        assertEquals(0, actualAnswer);
    }

    @Test
    void mul() {
        int actualAnswer = SimpleCalculator.mul(1, 0);

        assertEquals(0, actualAnswer);
    }

    @Test
    void divByZero() {
        Executable executable = () -> SimpleCalculator.div(1, 0);

        assertThrows(ArithmeticException.class, executable);
    }

    @Test
    void divNotByZero() {
        int actualAnswer = SimpleCalculator.div(1, 2);

        assertEquals(0, actualAnswer);
    }
}