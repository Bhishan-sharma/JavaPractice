package Day3;

import java.util.Scanner;

public class arith {
    public static void  divide(double a ,double b){
        if (b == 0) {
            throw new ArithmeticException("cannot be divided by zero");
        }else System.out.println(a/b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
