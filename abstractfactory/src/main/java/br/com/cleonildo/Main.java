package br.com.cleonildo;

import br.com.cleonildo.bancodobrasil.BBCalculosFactory;
import br.com.cleonildo.caixa.CaixaCalculosFactory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        System.out.println("##########Banco Caixa##########");

        CalculosFactory factory = new CaixaCalculosFactory();
        banco.gerarBoleto(BigDecimal.valueOf(100), factory);

        System.out.println();

        System.out.println("##########Banco do Brasil##########");
        factory = new BBCalculosFactory();
        banco.gerarBoleto(BigDecimal.valueOf(100), factory);

    }
}
