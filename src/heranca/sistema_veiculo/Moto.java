package heranca.sistema_veiculo;

public class Moto extends Veiculo {

    private boolean temSideCar;

    public Moto(String marca, String modelo, double velocidadeAtual, int velocidadeMaxima, boolean temSideCar) {
        super(marca, modelo, velocidadeAtual, velocidadeMaxima);
        this.temSideCar = temSideCar;
    }

    public boolean isTemSideCar() {
        return temSideCar;
    }

    @Override
    void exibirStatus(){
        super.exibirStatus();
        System.out.println("tem side car? " + temSideCar);
    }
}