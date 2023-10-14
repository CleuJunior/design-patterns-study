package com.br.study.patterns.creational.factorymethod.bancodobrasil;

import com.br.study.patterns.creational.factorymethod.Boleto;

import java.math.BigDecimal;

public class BancoDoBrasilBoleto60Dias extends Boleto {
    public BancoDoBrasilBoleto60Dias(BigDecimal valor) {
        super(valor);
        super.juros = BigDecimal.valueOf(0.1);
        super.desconto = BigDecimal.ZERO;
        super.multa = BigDecimal.valueOf(0.15);
    }
}
