package pac;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;


    static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    static double calculateCircumference(double r) {
        return PI * 2 * r;
    }

    static double calculateExponentialGrowth(double initialValue, double rate, double time) {
        return initialValue * Math.pow(E, rate * time);
    }
}
