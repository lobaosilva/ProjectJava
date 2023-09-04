import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, area, pi;

        x = sc.nextDouble();
        pi = 3.14159;

        area = pi * Math.pow(x, 2.0);

        System.out.printf("A = %.4f", area);

        sc.close();

    }
    
}
