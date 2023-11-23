package com.br.study.patterns.behavioral.visitor;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lucratividade implements Visitor {

    @Override
    public BigDecimal visitSupermercado(Supermercado supermercado) {
        return supermercado
                .getDepartamentos()
                .stream()
                .flatMap(departamento -> departamento.getProdutos().stream())
                .map(this::calculaLucratividadeProduto)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public BigDecimal visitDepartamento(Departamento departamento) {
        return departamento
                .getProdutos()
                .stream()
                .map(this::calculaLucratividadeProduto)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public BigDecimal visitProduto(Produto produto) {
        return this.calculaLucratividadeProduto(produto);
    }

    private BigDecimal calculaLucratividadeProduto(Produto produto){
        return produto.getPreco()
                .multiply(produto.getMargemLucro())
                .divide(new BigDecimal(100), 2, RoundingMode.HALF_EVEN);
    }
}
