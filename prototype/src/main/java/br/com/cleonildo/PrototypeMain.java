package br.com.cleonildo;

public class PrototypeMain {

    public static void main(String[] args) {
        // Criação do gerenciador de protótipos
        GerenciadorDePrototipos gerenciadorPrototipos = new GerenciadorDePrototipos();

        // Solicitação dos protótipos de Livro ao gerenciador
        Prototype livroPrototipo = gerenciadorPrototipos.getInstance("livro");

        // Clonagem do protótipo
        Livro livro1 = (Livro) livroPrototipo.clone();

        // Impressão do Livro 1 com valores padrão
        System.out.println("==== Livro 1 com valores padrão. ====");
        System.out.println(livro1);

        // Edição das informações do Livro 1
        livro1.setNome("Livro 1");
        livro1.setAutor("Lucas da Silva");
        livro1.setNumeroPaginas(325);

        // Impressão do Livro 1 com valores editados
        System.out.println("\n==== Livro 1 com valores editados. ====");
        System.out.println(livro1);

        // Clonagem de mais um Livro
        Livro livro2 = (Livro) livroPrototipo.clone();

        // Impressão do Livro 2 com valores padrão
        System.out.println("\n==== Livro 2 com valores padrão. ====");
        System.out.println(livro2);

        // Edição das informações do Livro 2
        livro2.setNome("Livro 2");
        livro2.setAutor("Marlene dos Santos");
        livro2.setNumeroPaginas(420);

        // Impressão do Livro 1 e 2 com valores editados
        System.out.println("\n==== Livro 1 e 2 com valores editados. ====");
        System.out.println(livro1);
        System.out.println(livro2);
    }
}
