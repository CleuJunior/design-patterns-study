package com.br.study.patterns.creational.factorymethod.caixa;

import com.br.study.patterns.creational.factorymethod.Boleto;

import java.math.BigDecimal;

public class BancoCaixaBoleto10Dias extends Boleto {
    public BancoCaixaBoleto10Dias(BigDecimal valor) {
        super(valor);
        super.juros = BigDecimal.valueOf(0.02);
        super.desconto = BigDecimal.valueOf(0.1);
        super.multa = BigDecimal.valueOf(0.05);
    }
}
