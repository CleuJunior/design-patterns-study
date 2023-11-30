package br.com.cleonildo;

public class Main {

    public static void main(String[] args) {
        // Vamos criar um canal de envios de E-MAIL
        CanalDeEnvioInterface canalEnvio = new Email();

        // Vamos enviar uma mensagem de um administrador, definindo assunto e a mensagem
        Mensagem mensagemAdmin = new MensagemAdmin(canalEnvio);
        mensagemAdmin.setAssunto("Primeira mensagem");
        mensagemAdmin.setMensagem("Olá Usuário");
        mensagemAdmin.enviar();

        // Vamos enviar uma mensagem de um usuário, definindo assunto e a mensagem
        Mensagem mensagemUsuario = new MensagemUsuario(canalEnvio);
        mensagemUsuario.setAssunto("Primeira mensagem");
        mensagemUsuario.setMensagem("Olá Administrador");
        mensagemUsuario.enviar();

        // Agora vamos criar um canal de envios de SMS
        canalEnvio = new SMS();

        // Vamos enviar uma mensagem de um administrador, definindo assunto e a mensagem
        mensagemAdmin = new MensagemAdmin(canalEnvio);
        mensagemAdmin.setAssunto("Segunda mensagem");
        mensagemAdmin.setMensagem("Olá Usuário");
        mensagemAdmin.enviar();

        // Vamos enviar uma mensagem de um usuário, definindo assunto e a mensagem
        mensagemUsuario = new MensagemUsuario(canalEnvio);
        mensagemUsuario.setAssunto("Segunda mensagem");
        mensagemUsuario.setMensagem("Olá Administrador");
        mensagemUsuario.enviar();
    }
}
