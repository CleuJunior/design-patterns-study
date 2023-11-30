package br.com.cleonildo;

public class Livro implements Prototype {
    private String nome;
    private String autor;
    private int numeroPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Método responsável por clonar o objeto Livro
    public Prototype clone() {
        // Criação de uma nova instância de Livro
        Livro clone = new Livro();
        // Cópia dos atributos do objeto atual para o novo objeto
        clone.setNome(this.getNome());
        clone.setAutor(this.getAutor());
        clone.setNumeroPaginas(this.getNumeroPaginas());
        // O novo objeto idêntico ao objeto atual é retornado
        return clone;
    }

    // Formata o objeto quando impresso.
    @Override
    public String toString() {
        return "{\"nome\":\"" + nome + "\", \"autor\":\"" + autor + "\", \"numeroPaginas\":" + numeroPaginas + "}";
    }
}
