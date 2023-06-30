package Day1;

import java.util.Scanner;

public class evorod {
    public static void checkeven(long in){
        boolean iseven = in%2==0;
        if (iseven) System.out.println("even");
        else System.out.println("odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long in = sc.nextLong();
        checkeven(in);
        sc.close();

    }
}
