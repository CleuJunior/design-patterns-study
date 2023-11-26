package br.com.cleonildo.states;

import br.com.cleonildo.Pedido;

public class DespacharState implements State {
    private final Pedido pedido;
    private static final String MESSAGE_PAYED_INFO = "Operation not supported, the pedido has already been paid and shipped.";
    private static final String MESSAGE_DESPATCH_INFO = "Operation not supported, the pedido has already been dispatched.";
    private static final String MESSAGE_CANCEL_INFO = "Operation not supported, the pedido has already been shipped.";

    public DespacharState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        System.out.println(MESSAGE_PAYED_INFO);
    }

    @Override
    public void cancelarPedido() {
        System.out.println(MESSAGE_DESPATCH_INFO);
    }

    @Override
    public void despacharPedido() {
        System.out.println(MESSAGE_CANCEL_INFO);
    }

}
