package br.com.cleonildo;

public class Main {

    public static void main(String[] args) {
        ChatBot chatBot1 = new ChatBot();
        SalaDeChatMediator salaDeChat1 = new SalaDeChatMediator(chatBot1, "Sala de chat 1");

        ChatBot chatBot2 = new ChatBot();
        SalaDeChatMediator salaDeChat2 = new SalaDeChatMediator(chatBot2, "Sala de chat 2");

        Humano joao = new Humano("João");
        Humano maria = new Humano("Maria");
        Humano paulo = new Humano("Paulo");
        Humano lucia = new Humano("Lucia");
        Humano pedro = new Humano("Pedro");

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
