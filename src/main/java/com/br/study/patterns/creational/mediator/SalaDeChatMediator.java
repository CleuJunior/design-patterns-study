package com.br.study.patterns.creational.mediator;

import java.util.ArrayList;
import java.util.List;

public class SalaDeChatMediator implements SalaDeChatMediatorInterface {

    private final List<Usuario> usuarios;
    private final ChatBot chatBot;
    private final String nome;

    public SalaDeChatMediator(ChatBot chatBot, String nome) {
        this.usuarios = new ArrayList<>();
        this.chatBot = chatBot;
        this.chatBot.setMediator(this);
        this.nome = nome;
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario usuario) {
        if (this.chatBot.validarMensagem(usuario)) {
            this.usuarios.stream()
                    .filter(u -> !u.equals(usuario))
                    .forEach(u -> u.receber(mensagem));

            System.out.println("---------------------------------");
        }
    }


    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
        this.usuarios.removeIf(u -> u.equals(usuario));
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
