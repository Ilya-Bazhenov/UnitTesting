package quadratic_equation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class QuadraticEquationTest {

    @Test
    void shouldThrowIllegalArgumentExceptionWhenFirstCoefficientIsZero() {
        assertThrows(IllegalArgumentException.class, () -> new QuadraticEquation(0, 1, 1));
    }

    @Test
    void shouldReturnEmptyListWhenDiscriminantLessThanZero() {
        List<Double> actualRoots = new QuadraticEquation(1, 2, 2).calculateRoots();

        assertTrue(actualRoots.isEmpty());
    }

    @Test
    void shouldReturnTwoRootsWhenDiscriminantIsGreaterThanOrEqualToZero() {
        List<Double> expectedRoots = List.of(0.5, -3.0);

        List<Double> actualRoots = new QuadraticEquation(2, 5, -3).calculateRoots();

        assertIterableEquals(expectedRoots, actualRoots);
    }
}