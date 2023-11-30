package br.com.cleonildo;

public class PizzaQueijo extends Pizza {

    public PizzaQueijo() {
        // Adicionamos uma descrição para pizza de queijo;
        this.descricao = "Deliciosa pizza de queijo";
    }

    // Implementação de getDescricao feita por PizzaQueijo.
    @Override
    public String getDescricao() {
        return this.descricao;
    }

    // Implementação de getPreco feita por PizzaQueijo.
    @Override
    public float getPreco() {
        return 22;
    }
}
