package br.com.lobaocode;

public class Blocos {

    public static void main(String[] args) {

        if (x > 10) {
            System.out.println("X é maior que 10");
            System.out.println(" ***** FIM ***** ");
        }

        if (x > 10) {
            System.out.println("X é maior que 10");
        } else {
            System.out.println("X é menor ou igual a 10");
        }

        if (x > 10) {
            System.out.println("X é maior que 10");
        } else if (x == 10) {
            System.out.println("X é igual a 10");
        } else {
            System.out.println("X é menor que 10");
        }

    }
    
}

// if (condição) instrução.
// if (condição) {
//     instrução 1;
//     instrução 2;
// }

// if (condição) {
//     instrução;
// } else {
//     instrução;
// }