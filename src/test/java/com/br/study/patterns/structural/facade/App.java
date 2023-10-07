package com.br.study.patterns.structural.facade;

import com.br.study.patterns.structural.facade.sales.SaleFacade;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class App {
    private final Consumer consumer = new Consumer("Luiz da Silva", "12345678910", "luiz@outlook.com");
    private final Product productOne = new Product("Blusa Rosa", "Blusa feminina rosa", BigDecimal.valueOf(80.99));
    private final Product productTwo = new Product("Camiseta Preta", "Camisita preta masculina", BigDecimal.valueOf(49.90));
    private final Product productThree = new Product("Calças Jeans", "Calças jeans masculina", BigDecimal.valueOf(119.90));
    private final SaleFacade sales = new SaleFacade(this.consumer);

    @Test
    public void simpleTest() {
        this.sales.addProduct(this.productOne);
        this.sales.addProduct(this.productTwo);
        this.sales.addProduct(this.productThree);

        this.sales.orderCredit();

        assertTrue(true);
    }

}