package br.com.cleonildo;

public interface PIterator<T> {
    // Retorna um boolean que indica se existe um próximo elemento.
    boolean hasNext();

    // Retorna o próximo elemento.
    T next();
}
