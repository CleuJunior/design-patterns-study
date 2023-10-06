package com.br.study.patterns.behavioral.state.states;

import com.br.study.patterns.behavioral.state.Order;

public class SentState implements State {
    private final Order order;
    private static final String MESSAGE_PAYMENT_INFO = "Operation not supported, the order has already been paid and shipped.";
    private static final String MESSAGE_CENCELED_INFO = "Operation not supported, the order has already been sent.";
    private static final String MESSAGE_DISPATHED_INFO = "Operation not supported, the order has already been sent.";

    public SentState(Order order) {
        this.order = order;
    }

    @Override
    public void successWhenPaying() {
        System.out.println(MESSAGE_PAYMENT_INFO);
    }

    @Override
    public void cancelOrder() {
        System.out.println(MESSAGE_CENCELED_INFO);
    }

    @Override
    public void dispatchOrder() {
        System.out.println(MESSAGE_DISPATHED_INFO);
    }
}
