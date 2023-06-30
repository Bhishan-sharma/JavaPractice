package Day3;

import java.util.Scanner;

public class mon {
    public static String month(int a){
        switch(a){
            case 1:
                return "Jan";
            case 2:
                return "feb";
            case 3:
                return "mar";
            case 4:
                return "apr";
            case 5:
                return "may";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "aug";
            case 9:
                return "sep";
            case 10:
                return "oct";
            case 11:
                return "nov";
            case 12:
                return "dec";
            default:
                throw new NumberFormatException("invalid input");
        }
    }

    public static void  getmon(int a){
        try {
            String name = month(a);
            System.out.println(name);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        getmon(a);
        sc.close();
    }
}