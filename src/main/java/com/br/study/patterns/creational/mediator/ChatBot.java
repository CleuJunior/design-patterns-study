package com.br.study.patterns.creational.mediator;

public class ChatBot extends Usuario {

    private Usuario ultimoUsuario;

    public ChatBot() {
        super("CHATBOT");
        this.ultimoUsuario = this;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("## " + super.getNome() + " enviou: " + mensagem + " ##");
        System.out.println("----");
        super.mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println(this.getNome() + " recebeu: " + mensagem);
    }

    public boolean validarMensagem(Usuario usuario) {
        if (this.ultimoUsuario.equals(usuario)) {
            this.enviar("Uma mensagem de " + usuario.getNome() + " foi negada!");
            return false;
        }
        this.ultimoUsuario = usuario;
        return true;
    }
}

