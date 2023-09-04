import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double avg;

        System.out.print("Enter the first number: ");
        x = sc.nextDouble();
        System.out.print("Enter the second number: ");
        y = sc.nextDouble();
        avg = (x + y) / 2.0;
        System.out.println("Average: " + avg);
        sc.close();
    }
}
