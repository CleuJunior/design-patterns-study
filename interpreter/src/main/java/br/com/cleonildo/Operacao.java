package br.com.cleonildo;

import java.util.Map;

public abstract class Operacao implements Expressao {
    protected Expressao esquerda; // Expressão da esquerda
    protected Expressao direita; // Expressão da direita

    // As duas expressões são esperadas no construtor de uma operação
    protected Operacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    // O método interpretar se mantém abstrato para que as subclasses de operação o implemente
    public abstract int interpretar(Map<String, Integer> contexto);
}

