package heranca.sistema_conta_bancaria;

public class Main {
    public static void main(String[] args) {

        ContaInvestimento ci1 = new ContaInvestimento("joao miguel", "12345", 2500.0, 10);
        ci1.exibirStatus();
        ci1.investir(1000);

        ContaUniversitaria cu1 = new ContaUniversitaria("Joao", "56789", 2000, "psicologia");
        cu1.exibirStatus();
        cu1.sacar(550);

        }
}
