package com.br.study.patterns.structural.composite;

public class GerenciadorDeArquivos {
    private final Component raiz;

    public GerenciadorDeArquivos(Component raiz) {
        this.raiz = raiz;
    }

    public void exibirTodos() {
        this.raiz.exibir();
    }
}
