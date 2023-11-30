package br.com.cleonildo;

public class Revista implements Prototype {
    private String nome;
    private int edicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    // Método responsável por clonar o objeto Revista
    public Prototype clone() {
        // Criação de uma nova instância de Revista
        Revista clone = new Revista();
        // Cópia dos atributos do objeto atual para o novo objeto
        clone.setNome(this.getNome());
        clone.setEdicao(this.getEdicao());
        // O novo objeto idêntico ao objeto atual é retornado
        return clone;
    }

    // Formata o objeto quando impresso.
    @Override
    public String toString() {
        return "{\"nome\":\"" + nome + "\", \"edicao\":" + edicao + "}";
    }
}

