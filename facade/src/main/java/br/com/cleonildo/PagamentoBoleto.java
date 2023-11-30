package br.com.cleonildo;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(Pedido pedido) {
        super(pedido);
    }

    @Override
    public boolean realizarPagamento() {
        return true;
    }
}
