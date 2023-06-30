package Day3;

public class arr {
    static int sum = 0;
    public static void read(int[] arr){
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length) {
                throw new ArrayIndexOutOfBoundsException("out of bound error");
            }else sum += arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            read(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println(sum);
        }
    }
}