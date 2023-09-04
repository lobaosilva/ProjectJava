package br.com.lobao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

    public static void main (String[] args) {

        try {

            // Abre o arquivo
            FileWriter stream = new FileWriter("arquivo.txt");
            PrintWriter print = new PrintWriter(stream);

            // Escreve no arquivo
            print.println("Teste");
            print.println("Escrevendo no arquivo");

            print.close();
            // Fecha o arquivo
            stream.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
