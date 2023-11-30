package br.com.cleonildo;

public class PizzaFrango extends Pizza {

    public PizzaFrango() {
        // Adicionamos uma descrição para pizza de frango;
        this.descricao = "Deliciosa pizza de frango";
    }

    // Implementação de getDescricao feita por PizzaFrango.
    @Override
    public String getDescricao() {
        return this.descricao;
    }

    // Implementação de getPreco feita por PizzaFrango.
    @Override
    public float getPreco() {
        return 19;
    }
}

