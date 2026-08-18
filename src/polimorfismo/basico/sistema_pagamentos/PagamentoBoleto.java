package polimorfismo.basico.sistema_pagamentos;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento por boleto.");

    }

    public void diaSemana(){
            System.out.println("o boleto só poderá ser pago dia util, caso seja fim de semana, pague na segunda.");
        }


}
