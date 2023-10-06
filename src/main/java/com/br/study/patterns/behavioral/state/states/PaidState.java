package com.br.study.patterns.behavioral.state.states;

import com.br.study.patterns.behavioral.state.Order;

public class PaidState implements State {
    private final Order order;
    private static final String MESSAGE_INFO = "Operation not supported, the order has already been paid.";


    public PaidState(Order order) {
        this.order = order;
    }

    @Override
    public void successWhenPaying() {
        System.out.println(MESSAGE_INFO);
    }

    @Override
    public void cancelOrder() {
        this.order.setCurrentState(this.order.getCanceled());
    }

    @Override
    public void dispatchOrder() {
        this.order.setCurrentState(this.order.getSent());
    }
}
