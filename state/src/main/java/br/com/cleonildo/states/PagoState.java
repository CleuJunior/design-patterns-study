package br.com.cleonildo.states;

import br.com.cleonildo.Pedido;

public class PagoState implements State {
    private final Pedido pedido;
    private static final String MESSAGE_INFO = "Operation not supported, the pedido has already been paid.";


    public PagoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        System.out.println(MESSAGE_INFO);
    }

    @Override
    public void despacharPedido() {
        this.pedido.setEstatosAtual(this.pedido.getCancelado());
    }

    @Override
    public void cancelarPedido() {
        this.pedido.setEstatosAtual(this.pedido.getEnviado());
    }
}
