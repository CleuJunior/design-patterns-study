package br.com.cleonildo;

public abstract class Pagamento {
    protected Pedido pedido;

    protected Pagamento(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract boolean realizarPagamento();
}

