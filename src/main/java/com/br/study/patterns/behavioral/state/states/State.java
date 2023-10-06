package com.br.study.patterns.behavioral.state.states;

public interface State {
    void successWhenPaying();
    void dispatchOrder();
    void cancelOrder();

}
