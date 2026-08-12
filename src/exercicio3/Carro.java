package exercicio3;

public class Carro extends Veiculo {

    private int numeroDePortas;
    private double combustivel;

    public Carro(String marca, String modelo, double velocidadeAtual, int velocidadeMaxima, int numeroDePortas, double combustivel) {
        super(marca, modelo, velocidadeAtual, velocidadeMaxima);
        this.numeroDePortas = numeroDePortas;
        this.combustivel = combustivel;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public double getCombustivel() {
        return combustivel;
    }

    @Override
    void exibirStatus(){
        super.exibirStatus();
        System.out.println("numero de portas: " + numeroDePortas);
        System.out.println("quantidade de gasolina: " + combustivel);
    }
}