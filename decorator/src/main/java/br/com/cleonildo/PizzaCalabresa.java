package br.com.cleonildo;

public class PizzaCalabresa extends Pizza {

    public PizzaCalabresa() {
        // Adicionamos uma descrição para pizza de calabresa;
        this.descricao = "Deliciosa pizza de calabresa";
    }

    // Implementação de getDescricao feita por PizzaCalabresa.
    @Override
    public String getDescricao() {
        return this.descricao;
    }

    // Implementação de getPreco feita por PizzaCalabresa.
    @Override
    public float getPreco() {
        return 25;
    }
}

