package br.com.cleonildo;

import java.util.List;

public class ListaIterator<T> implements PIterator<T> {
    private final Lista<T> lista;
    private int indice = 0;
    private final int tamanho;

    public ListaIterator(Lista<T> lista) {
        this.lista = lista;
        // Conta os elementos da lista.
        this.tamanho = lista.getTamanho();
    }

    // Retorna um boolean que indica se existe um próximo elemento.
    @Override
    public boolean hasNext() {
        return indice < tamanho;
    }

    // Retorna o próximo elemento.
    @Override
    public T next() {
        T item = lista.getItem(indice);
        indice++;
        return item;
    }
}
