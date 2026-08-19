package polimorfismo.intermediario.sistema_notificacoes;

public class Main {
    public static void main(String[] args) {

    Notificacao n1 = new Whatsapp();
    n1.enviar();
        ((Whatsapp) n1).enviarAudio();

    Notificacao n2 = new SMS();
    n2.enviar();
        ((SMS) n2).verificarSaldo();

    Notificacao n3 = new Email();
    n3.enviar();
        ((Email) n3).anexarArquivo();

    }
}
