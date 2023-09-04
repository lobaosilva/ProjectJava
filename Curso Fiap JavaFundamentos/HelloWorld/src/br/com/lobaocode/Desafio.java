package br.com.lobaocode;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcule seu IMC");
        System.out.println();
        System.out.println("Qual é o seu peso(kg)?");
        double peso = sc.nextDouble();
        System.out.println("Qual é a sua altura(m)?");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println();

        if (18.5 >= imc && imc <= 25) {
            System.out.println("Você está com o peso ideal!");
        } else {
            System.out.println("Você está fora do peso normal");
        }

        sc.close();

    }
    
}
