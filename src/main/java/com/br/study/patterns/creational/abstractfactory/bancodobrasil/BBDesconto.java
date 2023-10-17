package com.br.study.patterns.creational.abstractfactory.bancodobrasil;

import com.br.study.patterns.creational.abstractfactory.Desconto;

import java.math.BigDecimal;

public class BBDesconto implements Desconto {
    @Override
    public BigDecimal getDesconto() {
        return BigDecimal.valueOf(0.05);
    }
}
