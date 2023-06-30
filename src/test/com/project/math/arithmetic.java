package test.com.project.math;
import Day4com.myproject.math.Calculator;

public class arithmetic {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double ans = calculator.addition(5,10);
        ans = calculator.multiplication(5,10);
        ans = calculator.subtraction(5,10);
        ans = calculator.division(5,10);

        System.out.print(ans);
    }
}