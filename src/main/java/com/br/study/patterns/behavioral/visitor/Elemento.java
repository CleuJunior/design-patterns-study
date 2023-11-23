package com.br.study.patterns.behavioral.visitor;

import java.math.BigDecimal;

public interface Elemento {

    BigDecimal aceitar(Visitor visitor);
}
