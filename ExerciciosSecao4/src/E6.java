import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, at, ac, atr, aq, ar;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // AT = b*h/2
        at = A * C / 2;
        System.out.printf("TRIANGULO: %.3f%n", at);

        // AC = pi.r²
        ac = pi * Math.pow(C, 2.0);
        System.out.printf("CIRCULO: %.3f%n", ac);

        // ATr = (a + b) / 2 * h
        atr = (A + B) / 2.0 * C;
        System.out.printf("TRAPEZIO: %.3f%n", atr);

        // AQ = a²
        aq = Math.pow(B, 2.0);
        System.out.printf("QUADRADO: %.3f%n", aq);

        // AR = b * h
        ar = A * B;
        System.out.printf("RETANGULO: %.3f%n", ar);

        sc.close();

    }
    
}
