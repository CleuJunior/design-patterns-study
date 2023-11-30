package br.com.cleonildo;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDePrototipos {
    private final Map<String, Prototype> prototipos;

    public GerenciadorDePrototipos() {
        this.prototipos = new HashMap<>();

        // Criação de um objeto Livro
        Livro livro = new Livro();
        // Definição de seus valores iniciais
        livro.setNome("Desconhecido");
        livro.setAutor("Desconhecido");
        livro.setNumeroPaginas(0);
        // Armazenamento do objeto como um protótipo que ficará
        // disponível no gerenciador a partir do identificador 'livro'
        this.prototipos.put("livro", livro);

        // Criação de um objeto Revista
        Revista revista = new Revista();
        // Definição de seus valores iniciais
        revista.setNome("Desconhecido");
        revista.setEdicao(0);
        // Armazenamento do objeto como um protótipo que ficará
        // disponível no gerenciador a partir do identificador 'revista'
        this.prototipos.put("revista", revista);

        // Criação de um objeto Trabalho
        Trabalho trabalho = new Trabalho();
        // Definição de seus valores iniciais
        trabalho.setNome("Desconhecido");
        trabalho.setAutor("Desconhecido");
        trabalho.setTipo("Desconhecido");
        // Armazenamento do objeto como um protótipo que ficará
        // disponível no gerenciador a partir do identificador 'trabalho'
        this.prototipos.put("trabalho", trabalho);
    }

    public Prototype getInstance(String identificador) {
        return this.prototipos.get(identificador);
    }
}
