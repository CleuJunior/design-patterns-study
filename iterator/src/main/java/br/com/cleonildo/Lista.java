package br.com.cleonildo;

import java.util.ArrayList;
import java.util.List;

public class Lista<T> implements Agregado<T> {

    private final List<T> lista = new ArrayList<>();
    private final int tamanho;

    // Recebe o tamanho máximo da lista no construtor
    public Lista(int tamanhoMaximo) {
        this.tamanho = tamanhoMaximo;
    }

    // Se ainda couber, adiciona um item no fim da lista
    public boolean addItem(T item) {
        if (lista.size() <= (tamanho - 1)) {
            lista.add(item);
            return true;
        }
        return false;
    }

    // Retorna o item do índice passado por parâmetro
    public T getItem(int indice) {
        return lista.get(indice);
    }

    // Retorna o tamanho da lista
    public int getTamanho() {
        return tamanho;
    }

    // Retorna o Iterator da Lista
    @Override
    public PIterator<T> createIterator() {
        return new ListaIterator<>(this);
    }
}
