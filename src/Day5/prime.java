package Day5;

import java.util.Scanner;

public class prime {
    public static boolean isprime(long n){
        boolean prime = false;
        for (int i = 1; i < n; i++) {
            if (n%i == 0){
                prime = true;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (!isprime(n)) System.out.println("not prime number");
        else System.out.println("prime number");
    }
}