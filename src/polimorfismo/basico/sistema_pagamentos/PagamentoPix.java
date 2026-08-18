package polimorfismo.basico.sistema_pagamentos;

public class PagamentoPix extends Pagamento {

    @Override
    public void pagar(){
        System.out.println("Pagamento por pix");
    }

    public void QRCode(){
        System.out.println("pagamento somente pelo QRCode ");
    }
}
