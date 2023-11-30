package br.com.cleonildo;

public abstract class Mensagem {

    protected CanalDeEnvioInterface canal;
    protected String assunto;
    protected String mensagem;

    // Recebe um CanalDeEnvioInterface em seu construtor e mantêm referência a ele
    public Mensagem(CanalDeEnvioInterface canalDeEnvio) {
        this.canal = canalDeEnvio;
    }

    // Define o assunto
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    // Define a mensagem
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // Método abstrato que será implementado pelas subclasses de mensagem.
    public abstract void enviar();
}

