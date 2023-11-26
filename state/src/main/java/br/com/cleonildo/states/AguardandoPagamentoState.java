package br.com.cleonildo.states;


import br.com.cleonildo.Pedido;

public class AguardandoPagamentoState implements State {
    private final Pedido pedido;
    private static final String MESSAGE_INFO = "Operation not supported, the pedido has not yet been paid.";

    public AguardandoPagamentoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        this.pedido.setEstatosAtual(this.pedido.getPago());
    }

    @Override
    public void despacharPedido() {
        this.pedido.setEstatosAtual(this.pedido.getCancelado());
    }

    @Override
    public void cancelarPedido() {
        System.out.println(MESSAGE_INFO);
    }
}
