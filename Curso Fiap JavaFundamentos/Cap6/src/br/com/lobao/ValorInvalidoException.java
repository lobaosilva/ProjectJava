package br.com.lobao;

public class ValorInvalidoException extends RuntimeException {

    double saldo;

    public void depositar (double valor) {

        if (valor < 0) {

            throw new ValorInvalidoException();

        }

        saldo = saldo + valor;

    }

    public class SaldoInsuficienteException extends Exception {

    }

    public void sacar (double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {

            throw new SaldoInsuficienteException();

        }

        saldo = saldo - valor;
        
    }

}
