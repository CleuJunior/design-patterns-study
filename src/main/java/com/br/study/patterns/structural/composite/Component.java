package com.br.study.patterns.structural.composite;

public abstract class Component {

    public void adicionar(Component componente) {
        throw new RuntimeException();
    }

    public void remover(Component componente) {
        throw new RuntimeException();
    }

    public Component recuperarFilho(int index) {
        throw new RuntimeException();
    }

    public void exibir() {
        throw new RuntimeException();
    }

    public String getNome() {
        throw new RuntimeException();
    }

    public String getCaminho() {
        throw new RuntimeException();
    }
}
