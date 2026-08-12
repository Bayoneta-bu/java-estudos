package heranca.sistema_lojaEletronica;

public class Produto {

    private String nome;
    private double preco;
    protected int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }
    void vender(int quantidade){
    estoque -= quantidade;
        System.out.println("o estoque atual com as vendas é de: " + estoque);

    }

    void exibirInformacoes(){
        System.out.println("Nome: do produto " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade de estoque do produto: " + estoque);
    }

}
