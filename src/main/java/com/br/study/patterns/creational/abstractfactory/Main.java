package com.br.study.patterns.creational.abstractfactory;

import com.br.study.patterns.creational.abstractfactory.bancodobrasil.BBCalculosFactory;
import com.br.study.patterns.creational.abstractfactory.caixa.CaixaCalculosFactory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        System.out.println("##########Banco Caixa##########");

        CalculosFactory factory = new CaixaCalculosFactory();
        banco.gerarBoleto(BigDecimal.valueOf(100), factory);

        System.out.println("##########Banco do Brasil##########");
        factory = new BBCalculosFactory();
        banco.gerarBoleto(BigDecimal.valueOf(100), factory);

    }
}
