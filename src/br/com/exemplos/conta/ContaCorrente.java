package br.com.exemplos.conta;

import br.com.exemplos.conta.Conta;

public class ContaCorrente implements Conta {
    private double saldo;
    private final double ValorTaxa = 0.34;

    @Override//sobreescrevendo metodo da interface
    public void depositar(double valor){
        this.saldo += valor - ValorTaxa;
    }
    @Override//sobreescrevendo metodo da interface
    public void sacar(double valor){
        this.saldo -= valor + ValorTaxa;
    }
    @Override//sobreescrevendo metodo da interface
    public double getsaldo(){
        return this.saldo;
    }
}
