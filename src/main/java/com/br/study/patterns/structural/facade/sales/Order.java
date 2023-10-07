package com.br.study.patterns.structural.facade.sales;

import com.br.study.patterns.structural.facade.Consumer;
import com.br.study.patterns.structural.facade.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Consumer consumer;
    private final List<Product> products = new ArrayList<>();

    public Order(Consumer consumer) {
        this.consumer = consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
