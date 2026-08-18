package polimorfismo.basico.sistema_funcionarios;

public class Designer extends Funcionario {

    public Designer(String nome) {
        super(nome);
    }

    @Override
        void trabalhar(){
        System.out.println("Designer criando uma interface");
    }

    public void criarDesign(){
        System.out.println(getNome() + " está criando um design.");
    }
}
