package br.com.cleonildo;

public class Cliente implements Observer {
    private final String nome;
    private final String email;
    private final Subject subject;

    // O subject é recebido por parâmetro para que o cliente tenha acesso a ele.
    public Cliente(String nome, String email, Subject subject) {
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

