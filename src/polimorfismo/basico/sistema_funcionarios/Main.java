package polimorfismo.basico.sistema_funcionarios;

public class Main {
    public static void main(String[] args) {

    Funcionario f1 = new Programador("joao");
    f1.trabalhar();
    ((Programador) f1).programar();


    Funcionario f2 = new Designer("maysa");
    f2.trabalhar();
    ((Designer) f2).criarDesign();

    }

}
