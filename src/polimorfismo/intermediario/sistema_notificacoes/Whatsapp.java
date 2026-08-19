package polimorfismo.intermediario.sistema_notificacoes;

public class Whatsapp extends Notificacao{

    @Override
    public void enviar(){
        System.out.println("Enviando mensagem de Whatsapp para Joao Miguel");
    }

    public void enviarAudio(){
        System.out.println("Enviando mensagem de áudio para Joao Miguel");
    }
}
