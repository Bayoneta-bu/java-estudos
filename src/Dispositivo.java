public class Dispositivo {

    private String marca;
    private String modelo;
    protected int bateria;

    public Dispositivo(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getBateria() {
        return bateria;
    }

    void carregar(int porcentagem) {
        bateria += porcentagem;
        if (bateria > 100) {
            bateria = 100;
        }
        System.out.println("carregando, está em: " + bateria + " %");

    }

    void usar(int porcentagem) {
        if (porcentagem <= 0) {
            return;
        } else {
            System.out.println("bateria está em : " + porcentagem + " %");
        }

    }

    void exibirStatus() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("bateria: " + bateria);
    }
}
