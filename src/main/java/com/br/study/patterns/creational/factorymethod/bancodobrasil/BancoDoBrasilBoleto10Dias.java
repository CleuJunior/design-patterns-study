package com.br.study.patterns.creational.factorymethod.bancodobrasil;

import com.br.study.patterns.creational.factorymethod.Boleto;

import java.math.BigDecimal;

public class BancoDoBrasilBoleto10Dias extends Boleto {
    public BancoDoBrasilBoleto10Dias(BigDecimal valor) {
        super(valor);
        super.juros = BigDecimal.valueOf(0.03);
        super.desconto = BigDecimal.valueOf(0.05);
        super.multa = BigDecimal.valueOf(0.02);
    }
}
