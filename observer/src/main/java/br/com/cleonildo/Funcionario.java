package br.com.cleonildo;

public class Funcionario implements Observer {
    private final String nome;
    private final String email;
    private final Subject subject;

    public Funcionario(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;
        this.subject.registerObserver(this);
        this.subject.removeObserver(this);
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

