import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        System.out.println("Enter the first number: ");
        A = sc.nextInt();
        System.out.println("Enter the second number: ");
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
        
    }
}
