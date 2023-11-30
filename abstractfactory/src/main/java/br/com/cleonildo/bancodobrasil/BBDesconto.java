package br.com.cleonildo.bancodobrasil;


import br.com.cleonildo.Desconto;

import java.math.BigDecimal;

public class BBDesconto implements Desconto {
    @Override
    public BigDecimal getDesconto() {
        return BigDecimal.valueOf(0.05);
    }
}
