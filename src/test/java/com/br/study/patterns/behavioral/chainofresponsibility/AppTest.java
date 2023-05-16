package com.br.study.patterns.behavioral.chainofresponsibility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    private Order order;

    @Before
    public void setUp() {
        this.order = new Order();
    }

    @Test
    public void shouldReturn2PointsWith15Days() {
        order.setValue(21.0);
        final int expected = 2;
        final int days = 15;
        int actual = CalculatorPoints.calculatorPointsOrder(order, days);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn4PointsWith16Days() {
        order.setValue(21.0);
        final int expected = 4;
        final int days = 16;
        int actual = CalculatorPoints.calculatorPointsOrder(order, days);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn20PointsWith15Days() {
        order.setValue(100.0);
        final int expected = 20;
        final int days = 15;
        int actual = CalculatorPoints.calculatorPointsOrder(order, days);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn40PointsWith16Days() {
        order.setValue(100.0);
        final int expected = 40;
        final int days = 16;
        int actual = CalculatorPoints.calculatorPointsOrder(order, days);

        Assert.assertEquals(expected, actual);
    }
}
