package com.br.study.patterns.creational.abstractfactory.caixa;

import com.br.study.patterns.creational.abstractfactory.Juros;

import java.math.BigDecimal;

public class CaixaJuros implements Juros {
    @Override
    public BigDecimal getJuros() {
        return BigDecimal.valueOf(0.02);
    }
}
