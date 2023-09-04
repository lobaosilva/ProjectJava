import java.util.Locale;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        int y = 32;
        double x = 10.35784;

        System.out.println("Good morning!");
        System.out.println(y);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULT = " + x + " meters");
        System.out.printf("RESULT = %.2f meters%n", x);

        String name = "Maria";
        int age = 31;
        double income = 4000.0;

        System.out.printf("%s is %d years old and earns R$ %.2f reais%n", name, age, income);
    }
}
