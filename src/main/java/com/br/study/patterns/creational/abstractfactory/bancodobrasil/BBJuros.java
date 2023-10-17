package com.br.study.patterns.creational.abstractfactory.bancodobrasil;

import com.br.study.patterns.creational.abstractfactory.Juros;

import java.math.BigDecimal;

public class BBJuros implements Juros {

    @Override
    public BigDecimal getJuros() {
        return BigDecimal.valueOf(0.03);
    }
}
