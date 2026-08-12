package heranca.exercicio2;

public class ContaInvestimento extends Conta{
    private int taxaInvestimento;

    public ContaInvestimento(String titular, String numeroConta, double saldo, int taxaInvestimento) {
        super(titular, numeroConta, saldo);
        this.taxaInvestimento = taxaInvestimento;
    }

    public int getTaxaInvestimento() {
        return taxaInvestimento;
    }

    void investir(double valor){
        double investimento = valor * (taxaInvestimento / 100);
        saldo += valor + investimento;
        System.out.println("Valor investido: R$" + valor);
        System.out.println("Rendimento: " + investimento);
        System.out.println("saldo atual: " + saldo);


    }

    @Override
    void exibirStatus(){
        super.exibirStatus();
        System.out.println("Taxa de rendimento: " + taxaInvestimento);
    }

}
