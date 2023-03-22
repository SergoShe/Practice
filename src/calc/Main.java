package calc;

public class Main {
    public static void main(String[] args) {
        System.out.println("3.0 + 7L = " + Calc.sum(3.0,7L));
        System.out.println("8 / 3.0 = " + Calc.divide(8,3.0));
        System.out.println("5F / 0 = " + Calc.divide(5F,0));
        System.out.println("0.345 * 78L = " + Calc.multiply(0.345,78L));
        System.out.println("-20 - 51.3 = " +Calc.subtraction(-20,51.3));
    }
}
