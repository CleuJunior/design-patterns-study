package com.br.study.patterns.creational.factorymethod.bancodobrasil;

import com.br.study.patterns.creational.factorymethod.Boleto;

import java.math.BigDecimal;

public class BancoDoBrasilBoleto30Dias extends Boleto {
    public BancoDoBrasilBoleto30Dias(BigDecimal valor) {
        super(valor);
        super.juros = BigDecimal.valueOf(0.05);
        super.desconto = BigDecimal.valueOf(0.02);
        super.multa = BigDecimal.valueOf(0.05);
    }
}
