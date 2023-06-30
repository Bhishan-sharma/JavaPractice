package Day2;

public class Student {
    String name;
    int rollNo;
    int[] grades;
    public int average(){
        int total = 0;
        for (int i = 0; i < this.grades.length; i++) {
            total += this.grades[i];
        }
        if (total == 0) {
            return 0;
        }else return total/2;
    }
}
