package heranca.exercicio3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", "I6", 140, 300, 4, 75);
        c1.exibirStatus();
        c1.acelerar(100);

        Moto m1 = new Moto("Harley davidson", "grande ", 250, 300, true);
        m1.exibirStatus();
        m1.frear(50);
    }
}