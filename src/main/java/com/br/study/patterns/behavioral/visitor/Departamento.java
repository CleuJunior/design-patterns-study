package com.br.study.patterns.behavioral.visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Departamento  implements Elemento {

    private final String nome;
    private final List<Produto> produtos = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    @Override
    public BigDecimal aceitar(Visitor visitor) {
        return visitor.visitDepartamento(this);
    }
}
