package br.com.cleonildo.caixa;

import br.com.cleonildo.Desconto;

import java.math.BigDecimal;

public class CaixaDesconto implements Desconto {
    @Override
    public BigDecimal getDesconto() {
        return BigDecimal.valueOf(0.1);
    }
}
