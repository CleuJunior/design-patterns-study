package br.com.cleonildo;

public class Produto {
    private final String nome;
    private final String descricao;
    private final float valor;

    public Produto(String nome, String descricao, float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }
}

