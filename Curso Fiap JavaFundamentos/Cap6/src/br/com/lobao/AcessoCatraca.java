package br.com.lobao;

public class AcessoCatraca {

    private static int totalAcesso;

    private String nome;

    public void entrar(String nome) {
        this.nome = nome;
        totalAcesso = totalAcesso + 1;
    }

    public static int recuperarTotal() {
        return totalAcesso;
    }

    public static void main(String[] args) {

        AcessoCatraca a1 = new AcessoCatraca();
        a1.entrar("Thiago");

        AcessoCatraca a2 = new AcessoCatraca();
        a2.entrar("Leandro");

        int total = a1.recuperarTotal();
        System.out.println("Total " + total);

    }
    
}
