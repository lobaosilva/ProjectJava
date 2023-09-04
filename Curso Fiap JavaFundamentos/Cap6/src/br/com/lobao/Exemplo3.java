package br.com.lobao;

public class Exemplo3 {

    public static void main (String[] args) {

        // Cria uma nova instância de Conta
        Conta c = new Conta();

        try {

            // Saca
            c.sacar(100);

        } catch (Exception e) {

            e.printStackTrace();

        }

        // Deposita
        c.depositar(200);
        
    }
    
}
