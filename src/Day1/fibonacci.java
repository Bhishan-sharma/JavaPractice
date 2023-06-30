package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static int[] series(int in){
        int[] series = new int[in];
        series[1] = 1;
        int pre = 0, next = 1;
        for (int i = 2; i < in; i++) {
            series[i] = series[pre] + series[next];
            pre++; next++;
        }
        return series;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        System.out.println(Arrays.toString(series(in)));
        sc.close();
    }
}
