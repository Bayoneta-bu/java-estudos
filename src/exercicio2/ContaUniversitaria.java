package exercicio2;

public class ContaUniversitaria extends Conta {
    private String nomeCurso;

    public ContaUniversitaria(String titular, String numeroConta, double saldo, String nomeCurso) {
        super(titular, numeroConta, saldo);
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    void sacar(double valor){
        if(valor > 500){
            System.out.println("Limite de saque é R$500 por operação.");
            return;
        }
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado.");
    }

    @Override
    void exibirStatus(){
        super.exibirStatus();
        System.out.println("Nome do curso: " + nomeCurso);
    }


}
