package com.br.study.patterns.structural.decorator;

import com.br.study.patterns.structural.decorator.additional.CreamCheese;
import com.br.study.patterns.structural.decorator.additional.Wholemeal;
import com.br.study.patterns.structural.decorator.pizza.Pizza;
import com.br.study.patterns.structural.decorator.pizza.PizzaCheese;
import org.junit.Test;

public class App {
    private final Pizza pizzaChasse = new PizzaCheese();
    private final Pizza creamChesse = new CreamCheese(this.pizzaChasse);
    private final Pizza wholemeal = new Wholemeal(this.creamChesse);

    @Test
    public void simpleTeste() {
        System.out.printf("%s, price %.2f $", pizzaChasse.getDescription(), pizzaChasse.getPrice());
        System.out.println();

        System.out.printf("%s, price %.2f $", creamChesse.getDescription(), creamChesse.getPrice());
        System.out.println();

        System.out.printf("%s, price %.2f $", wholemeal.getDescription(), wholemeal.getPrice());
        System.out.println();

        assert true;
    }

}