package Day4com.myproject.math;

public class Calculator {
    public double addition(double a , double b){
        return a+b;
    }
    public double subtraction(double a , double b){
        return a-b;
    }
    public double multiplication(double a , double b){
        return a*b;
    }
    public double division(double a , double b){
        if (b == 0){
            throw new ArithmeticException("cannot be divided by zero");
        }else return a/b;
    }
}