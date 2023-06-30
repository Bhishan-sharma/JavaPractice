package Day4com.myproject.utils;

public class StringUtils {
    public String reverse(String a){
        StringBuilder rev = new StringBuilder();
        try {
            for (int i = a.length()-1; i >= 0; i--) {
                if (i == -1 || i == a.length()) {
                    throw new IndexOutOfBoundsException("i is -1");
                } else rev.append(a.charAt(i));
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            return rev.toString();
        }
    }
}