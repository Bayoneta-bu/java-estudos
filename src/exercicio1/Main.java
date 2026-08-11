package exercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Celular celular1 = new Celular("samsung", "s25", 68, 12345678);
        celular1.carregar(30);
        celular1.exibirStatus();
        celular1.ligar("2199999999");

        Notebook not1 = new Notebook("Asus", "book", 90, 8);
        not1.carregar(11);
        not1.exibirStatus();
        not1.abrirPrograma("ADOBE");
    }
}