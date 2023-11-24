package com.br.study.patterns.creational.mediator;

public abstract class Usuario {
    protected SalaDeChatMediatorInterface mediator;
    protected String nome;

    protected Usuario(String nome) {
        this.nome = nome;
    }

    public void setMediator(SalaDeChatMediatorInterface mediator) {
        if (this.mediator != null) {
            this.mediator.removerUsuario(this);
        }
        this.mediator = mediator;
        this.mediator.adicionarUsuario(this);
    }

    public String getNome() {
        return nome;
    }

    public abstract void enviar(String mensagem);
    public abstract void receber(String mensagem);
}
