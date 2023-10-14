package com.br.study.patterns.creational.factorymethod;

import com.br.study.patterns.creational.factorymethod.bancodobrasil.BancoDoBrasil;
import com.br.study.patterns.creational.factorymethod.caixa.BancoCaixa;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class App {
    private final Banco bancoCaixa = new BancoCaixa();
    private final Banco bancoDoBrasil = new BancoDoBrasil();


    @Test
    public void simpleTest() throws Exception {
        System.out.println("====================Banco Caixa====================");

        // 10 dias
        this.bancoCaixa.gerarBoleto(10, BigDecimal.valueOf(100));
        System.out.println();

        // 30 dias
        this.bancoCaixa.gerarBoleto(30, BigDecimal.valueOf(100));
        System.out.println();

        // 60 dias
        this.bancoCaixa.gerarBoleto(60, BigDecimal.valueOf(100));

        System.out.println();
        System.out.println("====================Banco do Brasil====================");


        // 10 dias
        this.bancoDoBrasil.gerarBoleto(10, BigDecimal.valueOf(100));
        System.out.println();

        // 30 dias
        this.bancoDoBrasil.gerarBoleto(30, BigDecimal.valueOf(100));
        System.out.println();

        // 60 dias
        this.bancoDoBrasil.gerarBoleto(60, BigDecimal.valueOf(100));

        assertTrue(true);
    }
}