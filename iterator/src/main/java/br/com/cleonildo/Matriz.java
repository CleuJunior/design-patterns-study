package br.com.cleonildo;

import java.util.ArrayList;
import java.util.List;

public class Matriz<T> implements Agregado<T> {
    private final List<List<T>> matriz;
    private final int quantidadeLinhas;
    private final int quantidadeColunas;
    private int linhaAtual = 0;
    private int colunaAtual = 0;

    // Recebe no construtor a quantidade máxima de linhas e colunas
    public Matriz(int quantidadeLinhas, int quantidadeColunas) {
        this.quantidadeLinhas = quantidadeLinhas;
        this.quantidadeColunas = quantidadeColunas;
        this.matriz = new ArrayList<>(quantidadeLinhas);

        for (int i = 0; i < quantidadeLinhas; i++) {
            matriz.add(new ArrayList<>(quantidadeColunas));
        }
    }

    // Recebe um item de qualquer tipo e o insere na matriz
    public boolean addItem(T item) {
        // Se chegou na última linha e última coluna
        if (linhaAtual == (quantidadeLinhas - 1) && colunaAtual == quantidadeColunas) {
            return false;
        }
        // Se chegou na última coluna
        if (colunaAtual == quantidadeColunas) {
            linhaAtual = linhaAtual + 1; // Incrementa a linha
            colunaAtual = 0; // Zera coluna
        }
        // Insere o Item
        matriz.get(linhaAtual).add(item);
        colunaAtual = colunaAtual + 1; // Incrementa Coluna
        return true;
    }

    // Retorna o item que estiver na linha e coluna passadas por parâmetro
    public T getItem(int linha, int coluna) {
        return matriz.get(linha).get(coluna);
    }

    // Retorna a quantidade de linhas da Matriz
    public int getQuantidadeLinhas() {
        return quantidadeLinhas;
    }

    // Retorna a quantidade de colunas da matriz
    public int getQuantidadeColunas() {
        return quantidadeColunas;
    }

    // Retorna o Itertor da Matriz
    public PIterator<T> createIterator() {
        return new MatrizIterator<>(this);
    }
}
