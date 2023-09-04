package br.com.lobao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

    public static void main(String[] args) {

        File diretorio = new File("fiap");

        if (diretorio.exists()) {
            System.out.println("Diretório existe!\n");
        } else {
            if (diretorio.mkdir())
                System.out.println("Diretório criado!\n");
            else
                System.out.println("Diretório não criado.\n");
        }

        File arquivo2 = new File(diretorio, "file.txt");
        
        try {
            if (arquivo2.createNewFile())
                System.out.println("Arquivo criado!\n");
            else
                System.out.println("Arquivo não criado!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File arquivo = new File("arquivo.txt");

        // Verifica se o arquivo existe
        if (arquivo.exists()) {
            System.out.println("O arquivo existe!\n" +
            "Pode ser lido: " + arquivo.canRead() + "\n" +
            "Pode ser gravado: " + arquivo.canWrite() + "\n" +
            "Tamanho: " + arquivo.length() + "\n" +
            "Caminho: " + arquivo.getPath());
        } else {
            // Cria o arquivo
            try {
                if (arquivo.createNewFile())
                    System.out.println("Arquivo criado!");
                else
                    System.out.println("Arquivo não criado!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            // Abre o arquivo para escrita
            FileWriter writer = new FileWriter(arquivo);
            // Abre o arquivo para leitura
            FileReader reader = new FileReader(arquivo);
            // Código
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
