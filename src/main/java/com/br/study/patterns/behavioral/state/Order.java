package com.br.study.patterns.behavioral.state;

import com.br.study.patterns.behavioral.state.states.AwaitingPaymentState;
import com.br.study.patterns.behavioral.state.states.CancelState;
import com.br.study.patterns.behavioral.state.states.PaidState;
import com.br.study.patterns.behavioral.state.states.SentState;
import com.br.study.patterns.behavioral.state.states.State;

public class Order {
    private State currentState;
    private final State awaitingPayment;
    private final State payed;
    private final State canceled;
    private final State sent;

    public Order() {
        this.awaitingPayment = new AwaitingPaymentState(this);
        this.payed = new PaidState(this);
        this.canceled = new CancelState(this);
        this.sent = new SentState(this);
        this.currentState = this.awaitingPayment;
    }

    public void doPayment() {
        try {
            this.currentState.successWhenPaying();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelOrder() {
        try {
            this.currentState.cancelOrder();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void dispatchOrder() {
        try {
            this.currentState.dispatchOrder();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public State getAwaitingPayment() {
        return awaitingPayment;
    }

    public State getPayed() {
        return payed;
    }

    public State getCanceled() {
        return canceled;
    }

    public State getSent() {
        return sent;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
