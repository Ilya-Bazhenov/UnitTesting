package quadratic_equation;

import static java.lang.Math.sqrt;

import java.util.List;
import java.util.ArrayList;

public final class QuadraticEquation {
    private final int a, b, c;

    public QuadraticEquation(int a, int b, int c) throws IllegalArgumentException {
        if (a == 0) throw new IllegalArgumentException("the first coefficient should not be 0");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public List<Double> calculateRoots() {
        int discriminant = b * b - 4 * a * c;
        List<Double> roots = new ArrayList<>();

        if (discriminant >= 0) {
            roots.add((-b + sqrt(discriminant)) / (2 * a));
            roots.add((-b - sqrt(discriminant)) / (2 * a));
        }

        return roots;
    }
}
