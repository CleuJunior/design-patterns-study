package br.com.cleonildo.caixa;

import br.com.cleonildo.Multa;

import java.math.BigDecimal;

public class CaixaMulta implements Multa {
    @Override
    public BigDecimal getMulta() {
        return BigDecimal.valueOf(0.02);
    }
}
