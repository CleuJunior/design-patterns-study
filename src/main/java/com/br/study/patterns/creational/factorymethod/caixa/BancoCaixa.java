package com.br.study.patterns.creational.factorymethod.caixa;

import com.br.study.patterns.creational.factorymethod.Banco;
import com.br.study.patterns.creational.factorymethod.Boleto;

import java.math.BigDecimal;
public class BancoCaixa extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimentoBoleto, BigDecimal valor) {
        return switch (vencimentoBoleto) {
            case 10 -> new BancoCaixaBoleto10Dias(valor);
            case 30 -> new BancoCaixaBoleto30Dias(valor);
            case 60 -> new BancoCaixaBoleto60Dias(valor);
            default -> null;
        };
    }
}
