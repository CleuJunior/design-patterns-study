package br.com.cleonildo;

public interface Agregado<T> {

    //Retorna o iterator do agregado.
   PIterator<T> createIterator();
}
