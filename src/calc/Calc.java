package calc;

public class Calc {

    public static <T extends Number, S extends Number> double sum(T a, S b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, S extends Number> double subtraction(T a, S b) {
        return a.doubleValue()-b.doubleValue();
    }

    public static <T extends Number, S extends Number> double multiply(T a, S b) {
        return a.doubleValue()*b.doubleValue();
    }

    public static <T extends Number, S extends Number> double divide(T a, S b) {
        return a.doubleValue()/b.doubleValue();
    }
}