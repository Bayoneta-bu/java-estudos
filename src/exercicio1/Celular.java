package exercicio1;

public class Celular extends Dispositivo {

    private int numeroChip;

    public Celular(String marca, String modelo, int bateria, int numeroChip) {
        super(marca, modelo, bateria);
        this.numeroChip = numeroChip;
    }

    public int getNumeroChip() {
        return numeroChip;
    }

    void ligar(String numero) {
        if (bateria <= 0) {
            System.out.println("Sem bateria!");
            return;
        }
        System.out.println("Ligando para " + numero + "...");

    }

    @Override
    void exibirStatus() {
        super.exibirStatus();
    }
}
