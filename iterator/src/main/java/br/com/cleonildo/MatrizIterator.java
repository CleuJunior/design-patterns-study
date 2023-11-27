package br.com.cleonildo;

public class MatrizIterator<T> implements PIterator<T> {
    private final Matriz<T> matriz;
    private int indiceLinha = 0;
    private int indiceColuna = 0;
    private final int qtdLinhas;
    private final int qtdColunas;

    public MatrizIterator(Matriz<T> matriz) {
        this.matriz = matriz;
        // Conta os arrays dentro da matriz.
        this.qtdLinhas = matriz.getQuantidadeLinhas();
        // Conta a quantidade de elementos dentro do primeiro array da matriz.
        this.qtdColunas = matriz.getQuantidadeColunas();
    }

    public void incrementarIndice() {
        // Se chegou ao limite de colunas.
        if (indiceColuna >= qtdColunas -1) {
            // Incrementa a linha.
            indiceLinha += 1;
            // Volta a coluna para zero.
            indiceColuna = 0;
        } else {
            // Apenas incrementa a coluna.
            indiceColuna += 1;
        }
    }

    // Retorna um boolean que indica se existe um próximo elemento.
    @Override
    public boolean hasNext() {
        return indiceLinha < qtdLinhas;
    }

    // Retorna o próximo elemento.
    @Override
    public T next() {
        T item = matriz.getItem(indiceLinha, indiceColuna);
        incrementarIndice();
        return item;
    }
}

