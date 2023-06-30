package lambdas;

public class main {
    public static void main(String[] args) {
//        This lambda works only if interface has one method
        Animal cat = () -> System.out.println("Meow");
        cat.sound();
    }
}