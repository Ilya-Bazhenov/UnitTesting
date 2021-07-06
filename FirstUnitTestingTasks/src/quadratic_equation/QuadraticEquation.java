package quadratic_equation;

import static java.lang.Math.sqrt;

public final class QuadraticEquation {
    private final int a, b, c;

    public QuadraticEquation(int a, int b, int c) throws IllegalArgumentException {
        if (a == 0) throw new IllegalArgumentException("the first coefficient should not be 0");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calculateRoots() {
        int discriminant = b * b - 4 * a * c;
        if (discriminant < 0) return "no roots";

        double x1 = ((-b + sqrt(discriminant)) / (2 * a));
        double x2 = ((-b - sqrt(discriminant)) / (2 * a));
        return String.valueOf(x1) + " " + String.valueOf(x2);
    }
}
