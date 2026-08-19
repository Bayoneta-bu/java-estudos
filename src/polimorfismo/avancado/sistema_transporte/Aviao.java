package polimorfismo.avancado.sistema_transporte;

public class Aviao extends Veiculo {

    public Aviao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void locomover(){
        System.out.println("avião se locomovendo pelo ar a 3920km/h");
    }



    public void pousar(int velocidade){
        if(velocidade > 1000){
            System.out.println("velocidade muito alta para pousar, diminua");
            return;
        }
        System.out.println("agora conseguimos pousar :) ");
    }
}
