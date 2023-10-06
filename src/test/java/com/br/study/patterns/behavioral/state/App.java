package com.br.study.patterns.behavioral.state;

import org.junit.Test;

import static org.junit.Assert.*;

public class App {
    private final Order order = new Order();

    @Test
    public void simpleTest() {
        this.order.doPayment();
        this.order.cancelOrder();
        this.order.doPayment();
        this.order.dispatchOrder();


        assertTrue(true);
    }

}