package br.com.cleonildo.states;

import br.com.cleonildo.Pedido;

public class EnviadoState implements State {
    private final Pedido pedido;
    private static final String MESSAGE_PAYMENT_INFO = "Operation not supported, the pedido has already been paid and shipped.";
    private static final String MESSAGE_CENCELED_INFO = "Operation not supported, the pedido has already been sent.";
    private static final String MESSAGE_DISPATHED_INFO = "Operation not supported, the pedido has already been sent.";

    public EnviadoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        System.out.println(MESSAGE_PAYMENT_INFO);
    }

    @Override
    public void despacharPedido() {
        System.out.println(MESSAGE_CENCELED_INFO);
    }

    @Override
    public void cancelarPedido() {
        System.out.println(MESSAGE_DISPATHED_INFO);
    }
}
