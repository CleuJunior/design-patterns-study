package com.br.study.patterns.creational.mediator;

public class Humano extends Usuario {

    public Humano(String nome) {
        super(nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("----------- " + super.mediator.getNome() + " -----------");
        System.out.println(super.getNome() + " enviou: " + mensagem);
        System.out.println("----");
        super.mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println(super.getNome() + " recebeu: " + mensagem);
    }
}
