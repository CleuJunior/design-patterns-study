package br.com.cleonildo.caixa;

import br.com.cleonildo.Juros;

import java.math.BigDecimal;

public class CaixaJuros implements Juros {
    @Override
    public BigDecimal getJuros() {
        return BigDecimal.valueOf(0.02);
    }
}
