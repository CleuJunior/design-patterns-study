package br.com.cleonildo;

public class MensagemUsuario extends Mensagem {

    public MensagemUsuario(CanalDeEnvioInterface canalDeEnvio) {
        super(canalDeEnvio);
    }

    // Simula o envio de uma mensagem feita por um Usuário
    @Override
    public void enviar() {
        System.out.println("Mensagem enviada por um USUÁRIO");
        this.canal.enviarMensagem(this.assunto, this.mensagem);
    }
}

