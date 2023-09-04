package br.com.lobaocode.tds;

public class ContaCorrente extends Conta {
    private String tipo;

    public ContaCorrente(int numero, String tipo) {
        super(numero);
        this.tipo = tipo;
    }

}
