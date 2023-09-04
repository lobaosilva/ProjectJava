import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exemplo 1
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        // Exemplo 2
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        // Exemplo 3
        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        // Exemplo 4
        char w;
        w = sc.next().charAt(0);
        System.out.println("Você digitou: " + w);

        // Exemplo 5
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();

    }
}
