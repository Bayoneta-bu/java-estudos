package polimorfismo.intermediario.sistema_Instrumentos_Musicais;

public class Guitarra extends Instrumento {

    public Guitarra(String marca, double preco) {
        super(marca, preco);
    }

    @Override
        public void tocar(){
            System.out.println("fazendo solo do oficina g3");
        }

        public void ativarPedaleira(){
            System.out.println("ligue e configure a pedaleira antes de voce começar a tocar ");
        }

        @Override
        public void exibirStatus(){
            System.out.println("Marca: " + getMarca());
            System.out.println("Preço: " + getPreco());
        }

}
