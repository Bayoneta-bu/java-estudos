package polimorfismo.intermediario.sistema_notificacoes;

public class SMS extends Notificacao{

    @Override
    public void enviar(){
        System.out.println("enviando SMS o numero (21)9 9999-9999");

    }

    public void verificarSaldo(){
        System.out.println("antes de enviar o SMS, verifique se há saldo, porque será descontado");
    }

}
