package com.br.study.patterns.behavioral.visitor;

import java.math.BigDecimal;

public class Produto implements Elemento {

    private final String nome;
    private final BigDecimal preco;
    private final BigDecimal margemLucro;

    public Produto(String nome, BigDecimal preco, BigDecimal margemLucro) {
        this.nome = nome;
        this.preco = preco;
        this.margemLucro = margemLucro;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public BigDecimal getMargemLucro() {
        return margemLucro;
    }

    @Override
    public BigDecimal aceitar(Visitor visitor) {
        return visitor.visitProduto(this);
    }
}
