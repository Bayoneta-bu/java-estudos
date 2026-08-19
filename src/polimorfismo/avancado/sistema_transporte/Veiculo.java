package polimorfismo.avancado.sistema_transporte;

public class Veiculo {

    private String nome;
    private double preco;

    public Veiculo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void locomover(){
        System.out.println("veículo se locomovendo");
    }

    public void exibirStatus(){
        System.out.println("nome: " + nome);
        System.out.println("preço: " + preco);
    }
}
