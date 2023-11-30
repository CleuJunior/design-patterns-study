package br.com.cleonildo;

public class MensagemAdmin extends Mensagem {

    public MensagemAdmin(CanalDeEnvioInterface canalDeEnvio) {
        super(canalDeEnvio);
    }

    // Simula o envio de uma mensagem feita por um Administrador
    @Override
    public void enviar() {
        System.out.println("Mensagem enviada pelo ADMINISTRADOR");
        this.canal.enviarMensagem(this.assunto, this.mensagem);
    }
}

