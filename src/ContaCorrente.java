public class ContaCorrente implements Conta{
    private double saldo;
    private double taxa = 0.25;//valor da taxa

    @Override//sobreescrevendo metodo da interface
    public void depositar(double valor){
        this.saldo += valor - taxa;
    }
    @Override//sobreescrevendo metodo da interface
    public void sacar(double valor){
        this.saldo -= valor + taxa;
    }
    @Override//sobreescrevendo metodo da interface
    public double getsaldo(){
        return this.saldo;
    }
}
