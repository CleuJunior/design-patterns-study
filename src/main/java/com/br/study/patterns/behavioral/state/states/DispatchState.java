package com.br.study.patterns.behavioral.state.states;

import com.br.study.patterns.behavioral.state.Order;

public class DispatchState implements State {
    private final Order order;
    private static final String MESSAGE_PAYED_INFO = "Operation not supported, the order has already been paid and shipped.";
    private static final String MESSAGE_DESPATCH_INFO = "Operation not supported, the order has already been dispatched.";
    private static final String MESSAGE_CANCEL_INFO = "Operation not supported, the order has already been shipped.";

    public DispatchState(Order order) {
        this.order = order;
    }

    @Override
    public void successWhenPaying() {
        System.out.println(MESSAGE_PAYED_INFO);
    }

    @Override
    public void dispatchOrder() {
        System.out.println(MESSAGE_DESPATCH_INFO);
    }

    @Override
    public void cancelOrder() {
        System.out.println(MESSAGE_CANCEL_INFO);
    }

}
