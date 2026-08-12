package heranca.sistema_lojaEletronica;

public class ProdutoEletronico extends Produto {
        private int garantiaMeses;
        private int voltagem;


    public ProdutoEletronico(String nome, double preco, int estoque, int garantiaMeses, int voltagem) {
        super(nome, preco, estoque);
        this.garantiaMeses = garantiaMeses;
        this.voltagem = voltagem;

    }


    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public int getVoltagem() {
        return voltagem;
    }

    @Override
    void vender(int quantidade) {

        estoque -= quantidade;
        System.out.println("Venda realizada!");
        System.out.println("=== NOTA FISCAL ===");
        System.out.println("Produto: " + getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$" + (getPreco() * quantidade));
        System.out.println("Garantia: " + garantiaMeses + " meses");
        System.out.println("===================");
    }

    void verificarVoltagem(int voltagemLocal){
    if(voltagemLocal == 110 || voltagemLocal == 220){
        System.out.println("produto pode ser utilizado, é bivolt");
    }else{
        System.out.println("voltagem incorreta ");
    }

    }
}
