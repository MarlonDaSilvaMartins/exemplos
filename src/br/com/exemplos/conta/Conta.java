package br.com.exemplos.conta;

public interface Conta {
    /*
    * interface
    * suporta heranças multiplas
    * apenas metodos abstratos
    * NAO pode conter atributos
    * NAO contem construtor
    *
    * Quando utilizamos as interfaces, estamos definindo um conjunto de assinatura de métodos que outras classes
    * devem implementar.
     */
    void depositar(double valor);//metodo sem corpo, apenas com parametro e tipo de retorno
    void sacar(double valor);//metodo sem corpo, apenas com parametro e tipo de retorno
    double getsaldo();//metodo sem corpo, apenas com tipo de retorno

    //java 9 implementação no interface
}
