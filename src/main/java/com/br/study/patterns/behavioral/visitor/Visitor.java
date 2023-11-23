package com.br.study.patterns.behavioral.visitor;

import java.math.BigDecimal;

public interface Visitor {

    BigDecimal visitSupermercado(Supermercado supermercado);
    BigDecimal visitDepartamento(Departamento departamento);
    BigDecimal visitProduto(Produto produto);
}
