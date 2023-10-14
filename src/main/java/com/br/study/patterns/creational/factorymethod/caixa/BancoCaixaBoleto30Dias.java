package com.br.study.patterns.creational.factorymethod.caixa;

import com.br.study.patterns.creational.factorymethod.Boleto;

import java.math.BigDecimal;

public class BancoCaixaBoleto30Dias extends Boleto {
    public BancoCaixaBoleto30Dias(BigDecimal valor) {
        super(valor);
        super.juros = BigDecimal.valueOf(0.05);
        super.desconto = BigDecimal.valueOf(0.05);
        super.multa = BigDecimal.valueOf(0.1);
    }
}
