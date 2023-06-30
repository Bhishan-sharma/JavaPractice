package Day5;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long ans = 1, n = sc.nextLong();

        if (n == 0 || n == 1) {
            System.out.println("1");
        }else {
            long i = n;
            while (i > 0) {
                ans *= i;
                i--;
            }
        }

        System.out.println(ans);
    }
}