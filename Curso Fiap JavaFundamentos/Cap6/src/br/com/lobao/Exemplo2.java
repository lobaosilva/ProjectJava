package br.com.lobao;

public class Exemplo2 {

    double saldo;

    public void depositar(double valor) {

        if (valor < 0) {

            throw new IllegalArgumentException();

        }

        saldo = saldo + valor;

    }

    public void sacar(double valor) throws Exception {

        if (valor > saldo) {

            throw new Exception("Saldo insuficiente");

        }

        saldo = saldo - valor;
        
    }

}
