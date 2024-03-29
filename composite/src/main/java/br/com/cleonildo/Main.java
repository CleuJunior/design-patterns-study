package br.com.cleonildo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pasta raiz = new Pasta("Raiz", "/");
        Pasta pasta1 = new Pasta("pasta 1", "pasta1/");
        Pasta pasta2 = new Pasta("pasta 2", "pasta2/");
        Pasta pasta2Ponto1 = new Pasta("pasta 2.1", "pasta2-1/");
        Pasta pasta3 = new Pasta("pasta 3", "pasta3/");

        List<Arquivo> arquivos = List.of(
               new Arquivo("Arquivo 1", "/arquivo1"),
               new Arquivo("Arquivo 2", "/arquivo2"),
               new Arquivo("Arquivo 3", "/arquivo3"),
               new Arquivo("Arquivo 4", "/arquivo4"),
               new Arquivo("Arquivo 5", "/arquivo5"),
               new Arquivo("Arquivo 6", "/arquivo6")
        );

        pasta1.adicionar(arquivos.get(0));
        pasta1.adicionar(arquivos.get(1));

        pasta2.adicionar(arquivos.get(2));
        pasta2.adicionar(arquivos.get(3));

        pasta2Ponto1.adicionar(arquivos.get(4));

        pasta3.adicionar(arquivos.get(5));

        raiz.adicionar(pasta1);
        raiz.adicionar(pasta2);
        raiz.adicionar(pasta2Ponto1);
        raiz.adicionar(pasta3);

        GerenciadorDeArquivos gerenciador = new GerenciadorDeArquivos(raiz);

        gerenciador.exibirTodos();
    }
}
