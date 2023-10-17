package com.br.study.patterns.creational.abstractfactory.bancodobrasil;

import com.br.study.patterns.creational.abstractfactory.Multa;

import java.math.BigDecimal;

public class BBMulta implements Multa {
    @Override
    public BigDecimal getMulta() {
        return BigDecimal.valueOf(0.02);
    }
}
