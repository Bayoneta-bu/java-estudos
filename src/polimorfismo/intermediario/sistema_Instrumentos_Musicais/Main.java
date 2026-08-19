package polimorfismo.intermediario.sistema_Instrumentos_Musicais;

public class Main {
    public static void main(String[] args) {

    Instrumento i1 = new Violao("tagima", 2000);
    i1.tocar();
        ((Violao) i1).afinar();
        i1.exibirStatus();

    Instrumento i2 = new Guitarra("fender", 5000);
    i2.tocar();
        ((Guitarra) i2).ativarPedaleira();
    i2.exibirStatus();

    Instrumento i3 = new Bateria("asterics", 10000);
    i3.tocar();
        ((Bateria) i3).trocarPele();
    i3.exibirStatus();

    }
}
