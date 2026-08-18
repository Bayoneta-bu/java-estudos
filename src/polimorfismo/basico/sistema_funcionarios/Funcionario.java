package polimorfismo.basico.sistema_funcionarios;

public class Funcionario {

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    void trabalhar(){
        System.out.println("Funcionário trabalhando...");

    }

}
