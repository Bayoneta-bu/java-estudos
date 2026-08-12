package heranca.exercicio1;

public class Notebook extends Dispositivo {

    private int memoriaRam;

    public Notebook(String marca, String modelo, int bateria, int memoriaRam) {
        super(marca, modelo, bateria);
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    void abrirPrograma(String programa) {
        if (getBateria() <= 0) {
            System.out.println("Sem bateria!");
            return;
        }

        System.out.println("Abrindo " + programa);
    }
}
