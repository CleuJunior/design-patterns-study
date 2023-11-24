package com.br.study.patterns.creational.mediator;

public class Main {

    public static void main(String[] args) {
        var chatBot1 = new ChatBot();
        var salaDeChat1 = new SalaDeChatMediator(chatBot1, "Sala de chat 1");

        var chatBot2 = new ChatBot();
        var salaDeChat2 = new SalaDeChatMediator(chatBot2, "Sala de chat 2");

        var joao = new Humano("João");
        var maria = new Humano("Maria");
        var paulo = new Humano("Paulo");
        var lucia = new Humano("Lucia");
        var pedro = new Humano("Pedro");

        joao.setMediator(salaDeChat1);
        maria.setMediator(salaDeChat1);
        paulo.setMediator(salaDeChat1);

        lucia.setMediator(salaDeChat2);
        pedro.setMediator(salaDeChat2);

        System.out.println("[Sala 1] João envia sua primeira mensagem");
        joao.enviar("Olá pessoal da sala 1, tudo bem?");

        System.out.println("[Sala 2] Lucia envia sua primeira mensagem");
        lucia.enviar("Olá Pedro, tudo bem?");

        System.out.println("[Sala 1] Paulo responde a João");
        paulo.enviar("Tudo bem comigo!");

        System.out.println("[Sala 1] Paulo tenta enviar duas mensagens consecutivas");
        paulo.enviar("E com você?");

        System.out.println("[Sala 2] Pedro não responde, Lucia tenta enviar outra mensagem");
        lucia.enviar("Pedro, você está aí?");

        System.out.println("Lucia troca de sala de chat");
        lucia.setMediator(salaDeChat1);

        System.out.println("[Sala 2] Lucia envia sua primeira mensagem na sala 2");
        lucia.enviar("Olá pessoal da sala 1, sou a Lucia. Tudo bem?");
    }
}
