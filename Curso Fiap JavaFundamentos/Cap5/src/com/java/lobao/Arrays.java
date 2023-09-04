package com.java.lobao;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] notas = new float[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota do aluno");
            notas[i] = sc.nextFloat();
        }

        // Calculadora média dos alunos

        float totalNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            totalNotas = totalNotas + notas[i];
        }

        float mediaNotas = totalNotas / notas.length;

        System.out.println("A média dos alunos é " + mediaNotas);

        for (float nota : notas) {
            System.out.println(nota);
        }

        sc.close();

    }

}
