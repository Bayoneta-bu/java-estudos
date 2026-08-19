package polimorfismo.intermediario.sistema_Instrumentos_Musicais;

public class Bateria extends Instrumento {

    public Bateria(String marca, double preco) {
        super(marca, preco);
    }

    @Override
    public void tocar(){
        System.out.println("Fazendo groove junto com o baixo");
    }

    public void trocarPele(){
        System.out.println("troque a pele da sua bateria para poder fazer barulho");
    }

    @Override
    public void exibirStatus(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: " + getPreco());
    }

}
