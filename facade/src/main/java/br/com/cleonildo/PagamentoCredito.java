package br.com.cleonildo;

public class PagamentoCredito extends Pagamento {

    public PagamentoCredito(Pedido pedido) {
        super(pedido);
    }

    @Override
    public boolean realizarPagamento() {
        return true;
    }
}

