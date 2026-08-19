package polimorfismo.intermediario.sistema_Instrumentos_Musicais;

public class Violao extends Instrumento {


    public Violao(String marca, double preco) {
        super(marca, preco);
    }

    @Override
    public void tocar(){
        System.out.println("Tocando a musica no violao, no tom de Sol");
    }

    public void afinar(){
        System.out.println("antes de voce tocar, voce deve afinar seu violão");

    }

    @Override
    public void exibirStatus(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: " + getPreco());
    }

}
