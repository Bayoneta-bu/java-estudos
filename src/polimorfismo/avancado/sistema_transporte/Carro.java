package polimorfismo.avancado.sistema_transporte;

public class Carro extends Veiculo {


    public Carro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void locomover(){
        System.out.println("Carro se locomovendo a 100 por hora");
    }

        public void combustivel(double quantidade){
        if (quantidade < 0 ) {
            System.out.println("veiculo sem gasolina, favor abastercer");
            return;
        }else if (quantidade > 100){
                System.out.println("veiculo com tanque cheio");
                return;
        }
        System.out.println("veículo com: " + quantidade + "% de combustível");
    }

}
