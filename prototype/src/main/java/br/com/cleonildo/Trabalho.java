package br.com.cleonildo;

public class Trabalho implements Prototype {
    private String nome;
    private String autor;
    private String tipo;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método responsável por clonar o objeto Trabalho
    public Prototype clone() {
        // Criação de uma nova instância de Trabalho
        Trabalho clone = new Trabalho();
        // Cópia dos atributos do objeto atual para o novo objeto
        clone.setNome(this.getNome());
        clone.setAutor(this.getAutor());
        clone.setTipo(this.getTipo());
        // O novo objeto idêntico ao objeto atual é retornado
        return clone;
    }

    // Formata o objeto quando impresso.
    @Override
    public String toString() {
        return "{\"nome\":\"" + nome + "\", \"autor\":\"" + autor + "\", \"tipo\":\"" + tipo + "\"}";
    }
}

