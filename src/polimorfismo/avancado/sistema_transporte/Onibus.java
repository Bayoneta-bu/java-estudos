package polimorfismo.avancado.sistema_transporte;

public class Onibus extends Veiculo {

    public Onibus(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void locomover(){
        System.out.println("Onibus se locomovendo a 60km/h");
    }



    public void garagem(int passageiros){
        if(passageiros > 0){
            System.out.println("não é possível ir pra garagem, pois ainda tem passageiros no onibus");
            return;

        }
        System.out.println("o onibus pode estacionar na garagem, não tem mais nenhum passageiro");
    }

}
