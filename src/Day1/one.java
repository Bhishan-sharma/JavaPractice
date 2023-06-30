package Day1;

import java.util.Scanner;

public class one {
    public static void area(double l, double b){
        System.out.println(l*b);
    }
    public static void perimeter(double l, double b){
        System.out.println(2*(l+b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        long start = System.currentTimeMillis();
        area(l, b);
        perimeter(l, b);
        long end = System.currentTimeMillis();
        System.out.println((end-start) +"ms");
        sc.close();
    }
}