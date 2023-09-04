package br.com.lobao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            //Lê os dois números
            System.out.print("Digite um número: ");
            int numero1 = sc.nextInt();
            System.out.print("Digite outro número: ");
            int numero2 = sc.nextInt();

            //Realiza a divisão
            int divisao = numero1 / numero2;

            //Exibe o resultado
            System.out.println("O resultado é: " + divisao);
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir!");
        } catch (InputMismatchException e) {
            System.err.println("Erro de entrada de dados!");
        } finally {
            System.out.println("Finalizado a execução do programa!");
            sc.close();
        }

    }

}
