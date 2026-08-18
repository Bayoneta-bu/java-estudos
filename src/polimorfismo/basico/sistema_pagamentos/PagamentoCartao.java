package polimorfismo.basico.sistema_pagamentos;

public class PagamentoCartao extends Pagamento {

    @Override
    public void pagar(){
        System.out.println("Pagamento em Cartão de Credito");
    }

    public void parcelamento(){
        System.out.println("Em quantas vezes deseja parcelar?");
    }
}
