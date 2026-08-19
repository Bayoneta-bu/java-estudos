package polimorfismo.intermediario.sistema_Instrumentos_Musicais;

public class Instrumento {

    private String marca;
    private double preco;

    public Instrumento(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public void tocar(){
        System.out.println("tocando instrumento");
    }

    public void exibirStatus(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
    }

}
