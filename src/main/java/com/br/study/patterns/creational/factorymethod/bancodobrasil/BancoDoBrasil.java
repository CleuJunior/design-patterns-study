package com.br.study.patterns.creational.factorymethod.bancodobrasil;

import com.br.study.patterns.creational.factorymethod.Banco;
import com.br.study.patterns.creational.factorymethod.Boleto;
import com.br.study.patterns.creational.factorymethod.caixa.BancoCaixaBoleto10Dias;
import com.br.study.patterns.creational.factorymethod.caixa.BancoCaixaBoleto30Dias;
import com.br.study.patterns.creational.factorymethod.caixa.BancoCaixaBoleto60Dias;

import java.math.BigDecimal;

public class BancoDoBrasil extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimentoBoleto, BigDecimal valor) {
        return switch (vencimentoBoleto) {
            case 10 -> new BancoDoBrasilBoleto10Dias(valor);
            case 30 -> new BancoDoBrasilBoleto30Dias(valor);
            case 60 -> new BancoDoBrasilBoleto60Dias(valor);
            default -> null;
        };
    }
}
