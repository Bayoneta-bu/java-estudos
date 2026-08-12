package heranca.sistema_lojaEletronica;

public class Main {
    public static void main(String[] args) {

        ProdutoPerecivel pP1 = new ProdutoPerecivel("Cebola", 3.0, 2000, 10);
        pP1.exibirInformacoes();
        pP1.vender(11);

        ProdutoEletronico pE1 = new ProdutoEletronico("Celular", 5000, 300, 12, 110);
        pE1.exibirInformacoes();
        pE1.vender(5);
        pE1.verificarVoltagem(110);

    }
}
