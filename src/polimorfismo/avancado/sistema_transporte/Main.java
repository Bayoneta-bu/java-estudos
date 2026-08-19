package polimorfismo.avancado.sistema_transporte;

public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Carro("DODGE RAM", 250000);
        v1.locomover();
        v1.exibirStatus();
        ((Carro) v1).combustivel(150);

        Veiculo v2 = new Moto("Kawazaki", 100000);
        v2.locomover();
        v2.exibirStatus();
        ((Moto) v2).empinar(true);

        Veiculo v3 = new Aviao("Boing", 3000000);
        v3.locomover();
        v3.exibirStatus();
        ((Aviao) v3).pousar(500);

        Veiculo v4 = new Onibus("mercedes", 100000);
        v4.locomover();
        v4.exibirStatus();
        ((Onibus) v4).garagem(0);


    }
}
