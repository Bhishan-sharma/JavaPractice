package test.com.project.math;
import Day4com.myproject.utils.StringUtils;

public class StringRev {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        String reverseString = stringUtils.reverse("hello");
        System.out.print(reverseString);
    }
}