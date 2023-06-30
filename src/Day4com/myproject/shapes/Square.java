package Day4com.myproject.shapes;
import Day4com.myproject.math.Calculator;
public class Square {
    static Calculator calculator = new Calculator();
    public static double area(double s){
        return Math.pow(s,2);
    }
    public static double perimeter(double s){
        return calculator.multiplication(4,s);
    }
}