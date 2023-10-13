package com.br.study.patterns.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class App {
    private final User pessoaFisica = new User("Joao da Silva", "12345678912", 25);

    @Test
    public void simpleTest() {
        long start = System.currentTimeMillis();
        System.out.println(pessoaFisica.validateName());

        long finish = System.currentTimeMillis();
        long timePassed = finish - start;
        System.out.println("Time passed: " + timePassed);

        assertTrue(true);
    }

}