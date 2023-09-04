package com.java.lobao;

public class Strings {

    public static void main(String[] args) {

        String facu = "FIAP - A Melhor Faculdade de Tecnologia";

        String[] palavras = facu.split(" ");

        for (String p : palavras) {
            System.out.println(p);
        }

    }

}
