package br.com.cleonildo;

public class Email implements CanalDeEnvioInterface {

    @Override
    public void enviarMensagem(String assunto, String mensagem) {
        System.out.println("=== Mensagem Enviada por E-MAIL ===");
        System.out.println("ASSUNTO: " + assunto);
        System.out.println("-----------------");
        System.out.println("MENSAGEM: " + mensagem + "\n");
    }
}

