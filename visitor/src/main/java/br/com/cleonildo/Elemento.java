package br.com.cleonildo;

import java.math.BigDecimal;

public interface Elemento {

    BigDecimal aceitar(Visitor visitor);
}
