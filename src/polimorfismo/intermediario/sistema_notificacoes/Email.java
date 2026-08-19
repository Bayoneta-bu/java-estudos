package polimorfismo.intermediario.sistema_notificacoes;

public class Email extends Notificacao{


    public void enviar(){
        System.out.println("enviando email para joao@hotmail.com");
    }

    public void anexarArquivo(){
        System.out.println("escolha o arquivo a ser anexado.");
    }
}
