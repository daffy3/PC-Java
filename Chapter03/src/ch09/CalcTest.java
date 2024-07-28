package ch09;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
    }
}