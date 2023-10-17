package com.br.study.patterns.creational.abstractfactory.caixa;

import com.br.study.patterns.creational.abstractfactory.Desconto;

import java.math.BigDecimal;

public class CaixaDesconto implements Desconto {
    @Override
    public BigDecimal getDesconto() {
        return BigDecimal.valueOf(0.1);
    }
}
