package polimorfismo.basico.sistema_pagamentos;

public class Main {
    public static void main(String[] args) {



    Pagamento p1 = new PagamentoBoleto();
    p1.pagar();
        ((PagamentoBoleto) p1).diaSemana();

    Pagamento p2 = new PagamentoCartao();
    p2.pagar();
        ((PagamentoCartao) p2).parcelamento();

    Pagamento p3 = new PagamentoPix();
    p3.pagar();
        ((PagamentoPix) p3).QRCode();

    }
}
