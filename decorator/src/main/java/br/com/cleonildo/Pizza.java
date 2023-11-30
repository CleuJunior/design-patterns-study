package br.com.cleonildo;

public abstract class Pizza {

    protected String descricao = "Descrição não definida";
    protected float preco;

    // Todas as classes que herdam de pizza precisam implementar este método.
    public abstract String getDescricao();

    // Todas as classes que herdam de pizza precisam implementar este método.
    public abstract float getPreco();
}

