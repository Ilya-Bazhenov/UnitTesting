package quadratic_equation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadraticEquationTest {

    @Test
    void calculateRoots() {
        assertEquals("no roots", new QuadraticEquation(1, 2, 2).calculateRoots());
        assertEquals("0.5 -3.0", new QuadraticEquation(2, 5, -3).calculateRoots());
    }
}