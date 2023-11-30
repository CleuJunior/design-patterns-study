package br.com.cleonildo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Consumidor consumidor;
    private final List<Produto> produtos = new ArrayList<>();

    public Pedido(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
}

