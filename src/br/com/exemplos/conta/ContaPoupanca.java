package br.com.exemplos.conta;

import br.com.exemplos.conta.Conta;

public class ContaPoupanca implements Conta {
    private double saldo;

    @Override//sobreescrevendo metodo da interface
    public void depositar(double valor){
        this.saldo += valor;
    }
    @Override//sobreescrevendo metodo da interface
    public void sacar(double valor){
        this.saldo -= valor;
    }
    @Override//sobreescrevendo metodo da interface
    public double getsaldo(){
        return this.saldo;
    }
}
