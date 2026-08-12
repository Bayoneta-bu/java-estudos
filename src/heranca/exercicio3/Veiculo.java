package heranca.exercicio3;

public class Veiculo {

    private String marca;
    private String modelo;
    protected double velocidadeAtual;
    private int velocidadeMaxima;

    public Veiculo(String marca, String modelo, double velocidadeAtual, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    void acelerar(int velocidade){
        if(velocidadeAtual + velocidade > velocidadeMaxima){
            System.out.println("Velocidade máxima atingida!");
            velocidadeAtual = velocidadeMaxima;
            return;
        }
        velocidadeAtual += velocidade;
        System.out.println("Acelerando... velocidade atual: " + velocidadeAtual);
    }

    void frear(int velocidade){
        if(velocidadeAtual - velocidade < 0){
            velocidadeAtual = 0;
            System.out.println("Veículo parado.");
            return;
        }
        velocidadeAtual -= velocidade;
        System.out.println("Freando... velocidade atual: " + velocidadeAtual);
    }

    void exibirStatus(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("velocidade atual: " + velocidadeAtual);
        System.out.println("velocidade maxima: " + velocidadeMaxima);

    }
}
