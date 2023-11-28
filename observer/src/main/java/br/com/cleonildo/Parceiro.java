package br.com.cleonildo;

public class Parceiro implements Observer {
    private final String nome;
    private final String email;
    private final Subject subject;

    public Parceiro(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void update(String mensagem) {
        Email.enviarEmail(this, mensagem);
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }
}
