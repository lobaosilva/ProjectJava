import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p1, np1, p2, np2;
        double vu1, vu2, vt;

        p1 = sc.nextInt();
        np1 = sc.nextInt();
        vu1 = sc.nextDouble();

        p2 = sc.nextInt();
        np2 = sc.nextInt();
        vu2 = sc.nextDouble();

        vt = (double)np1 * vu1 + (double)np2 * vu2;

        System.out.printf("VALOR A PAGAR = R$ %.2f", vt);

        sc.close();

    }
    
}
