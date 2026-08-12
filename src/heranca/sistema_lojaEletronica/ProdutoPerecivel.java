package heranca.sistema_lojaEletronica;

public class ProdutoPerecivel extends Produto{

    private int diasParaVencer;

    public ProdutoPerecivel(String nome, double preco, int estoque, int diasParaVencer) {
        super(nome, preco, estoque);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    @Override
    void vender(int quantidade){
        if(diasParaVencer <= 0){
            System.out.println("não é possível vender o produto");
            return;
        }

        estoque -= quantidade;
        System.out.println("o estoque atual com as vendas é de: " + estoque);
    }

}
