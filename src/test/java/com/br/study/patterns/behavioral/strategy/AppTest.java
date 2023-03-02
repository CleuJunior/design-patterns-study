package com.br.study.patterns.behavioral.strategy;

import com.br.study.patterns.behavioral.strategy.Order.ElectronicOrder;
import com.br.study.patterns.behavioral.strategy.Order.FurnitureOrder;
import com.br.study.patterns.behavioral.strategy.Order.Order;
import com.br.study.patterns.behavioral.strategy.Shipping.Shipping;
import com.br.study.patterns.behavioral.strategy.Shipping.StrategyCommonShipping;
import com.br.study.patterns.behavioral.strategy.Shipping.StrategyExpressShipping;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testCalculateShippingCostWithShippingElectronicOrder() {
        Shipping shipping = new StrategyCommonShipping();

        Order order = new ElectronicOrder("IT", 850.0, shipping);
        Double expectedCommonShipping = 42.5;
        Double actualCommonShipping = order.calculateShipping();

        assertEquals(expectedCommonShipping, actualCommonShipping);
        assertTrue(order.getShippingType().toString().contains("Common"));

        shipping = new StrategyExpressShipping();
        order.setShippingType(shipping);

        Double expectedExpressShipping = 85.0;
        Double actualExpressShipping = order.calculateShipping();

        assertEquals(expectedExpressShipping, actualExpressShipping);
        assertTrue(order.getShippingType().toString().contains("Express"));
    }

    @Test
    public void testCalculateShippingCostWithShippingFurnitureOrder() {
        Shipping shipping = new StrategyCommonShipping();

        Order order = new FurnitureOrder("Mall", 375.89, shipping);
        Double expectedCommonShipping = 18.7945;
        Double actualCommonShipping = order.calculateShipping();

        assertEquals(expectedCommonShipping, actualCommonShipping);
        assertTrue(order.getShippingType().toString().contains("Common"));

        shipping = new StrategyExpressShipping();
        order.setShippingType(shipping);

        Double expectedExpressShipping = 37.589;
        Double actualExpressShipping = order.calculateShipping();

        assertEquals(expectedExpressShipping, actualExpressShipping);
        assertTrue(order.getShippingType().toString().contains("Express"));
    }

    @Test
    public void listOfValuesWithShippingFurnitureOrder() {
        Order order = new ElectronicOrder(0.0, null);

        List<Double> listOfValues = List.of(
                891.88,
                1789.33,
                751.15,
                671.77,
                99.99
        );

        for (Double value : listOfValues) {
            assertCommonShippingValeu(order, value);
            assertExpressShippingValeu(order, value);
        }
    }

    private void assertCommonShippingValeu(Order order, Double value) {
        Double expectedCommonShippingValue = value * 0.05;
        order.setValue(value);
        order.setShippingType(new StrategyCommonShipping());
        Double actualCommonShippingValue = order.calculateShipping();
        assertEquals(expectedCommonShippingValue, actualCommonShippingValue);
    }

    private void assertExpressShippingValeu(Order order, Double value) {
        Double expectedExpressShippingValue = value * 0.1;
        order.setValue(value);
        order.setShippingType(new StrategyExpressShipping());
        Double actualExpressShippingValue = order.calculateShipping();
        assertEquals(expectedExpressShippingValue, actualExpressShippingValue);
    }
}
