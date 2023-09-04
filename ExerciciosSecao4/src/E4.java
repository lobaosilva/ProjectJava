import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int f, ht;
        double sh, s;

        f = sc.nextInt();
        ht = sc.nextInt();
        sh = sc.nextDouble();

        s = sh * (double)ht;

        System.out.printf("NUMBER = %d%n", f);
        System.out.printf("SALARY = U$ %.2f", s);

        sc.close();

    }
    
}
