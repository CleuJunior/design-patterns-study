package com.br.study.patterns.behavioral.state.states;

import com.br.study.patterns.behavioral.state.Order;

public class CancelState implements State {
    private final Order order;
    private static final String MESSAGE_PAYED_INFO = "Operation not supported, the order has been cancelled.";
    private static final String MESSAGE_CANCEL_INFO = "Operation not supported, order already cancelled.";
    private static final String MESSAGE_DESPATCH_INFO = "Operation not supported, the order has been cancelled.";

    public CancelState(Order order) {
        this.order = order;
    }

    @Override
    public void successWhenPaying() {
        System.out.println(MESSAGE_PAYED_INFO);
    }

    @Override
    public void cancelOrder() {
        System.out.println(MESSAGE_CANCEL_INFO);
    }

    @Override
    public void dispatchOrder() {
        System.out.println(MESSAGE_DESPATCH_INFO);
    }
}
