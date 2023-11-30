package br.com.cleonildo.bancodobrasil;


import br.com.cleonildo.Multa;

import java.math.BigDecimal;

public class BBMulta implements Multa {
    @Override
    public BigDecimal getMulta() {
        return BigDecimal.valueOf(0.02);
    }
}
