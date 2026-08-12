package exercicio2;

public class Conta {
    private String titular;
    private String numeroConta;
    protected double saldo;

    public Conta(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double valor){
        saldo += valor;
        System.out.println("o novo saldo apos o deposito é : " + valor);

    }

    void exibirStatus(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero da conta " + numeroConta);
        System.out.println("saldo: R$ " + saldo);

    }

}
