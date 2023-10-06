package com.br.study.patterns.behavioral.state.states;

import com.br.study.patterns.behavioral.state.Order;

public class AwaitingPaymentState implements State {
    private final Order order;
    private static final String MESSAGE_INFO = "Operation not supported, the order has not yet been paid.";

    public AwaitingPaymentState(Order order) {
        this.order = order;
    }

    @Override
    public void successWhenPaying() {
        this.order.setCurrentState(this.order.getPayed());
    }

    @Override
    public void cancelOrder() {
        this.order.setCurrentState(this.order.getCanceled());
    }

    @Override
    public void dispatchOrder() {
        System.out.println(MESSAGE_INFO);
    }
}
