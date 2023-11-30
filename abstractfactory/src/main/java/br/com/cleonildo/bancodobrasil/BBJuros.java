package br.com.cleonildo.bancodobrasil;

import br.com.cleonildo.Juros;

import java.math.BigDecimal;

public class BBJuros implements Juros {

    @Override
    public BigDecimal getJuros() {
        return BigDecimal.valueOf(0.03);
    }
}
