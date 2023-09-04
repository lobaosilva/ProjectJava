package com.java.lobao;

public class HashSet {

    private void add(String string) {

    }

    public static void main(String[] args) {

        HashSet cursos = new HashSet();

        cursos.add("Java");
        cursos.add(".NET");
        cursos.add("Android");

        cursos.add("Java"); // Repetido!

        // Imprime todos os elementos
        System.out.println(cursos);

    }

}
