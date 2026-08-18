package polimorfismo.basico.sistema_funcionarios;

public class Programador extends Funcionario{

    public Programador(String nome) {
        super(nome);
    }

    @Override
        void trabalhar(){
        System.out.println("Programador escrevendo codigo");
    }

    public void programar() {
        System.out.println(getNome() + " está programando Java.");
    }


}
