package br.com.cleonildo.states;

import br.com.cleonildo.Pedido;

public class CanceladoState implements State {
    private final Pedido pedido;
    private static final String MESSAGE_PAYED_INFO = "Operation not supported, the pedido has been cancelled.";
    private static final String MESSAGE_CANCEL_INFO = "Operation not supported, pedido already cancelled.";
    private static final String MESSAGE_DESPATCH_INFO = "Operation not supported, the pedido has been cancelled.";

    public CanceladoState(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void sucessoAoPagar() {
        System.out.println(MESSAGE_PAYED_INFO);
    }

    @Override
    public void despacharPedido() {
        System.out.println(MESSAGE_CANCEL_INFO);
    }

    @Override
    public void cancelarPedido() {
        System.out.println(MESSAGE_DESPATCH_INFO);
    }
}
