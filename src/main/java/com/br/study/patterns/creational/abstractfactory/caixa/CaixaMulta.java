package com.br.study.patterns.creational.abstractfactory.caixa;

import com.br.study.patterns.creational.abstractfactory.Multa;

import java.math.BigDecimal;

public class CaixaMulta implements Multa {
    @Override
    public BigDecimal getMulta() {
        return BigDecimal.valueOf(0.02);
    }
}
