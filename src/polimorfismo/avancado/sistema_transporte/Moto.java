package polimorfismo.avancado.sistema_transporte;

public class Moto extends Veiculo {

    public Moto(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public void locomover(){
        System.out.println("moto se locomovendo a 150 por hora");
    }


    public void empinar(boolean chao){
        if (chao){
            System.out.println("moto não está empinando, pois está no chão");
        }else{
            System.out.println("moto empinando");
        }
    }

}
