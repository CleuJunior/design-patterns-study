package br.com.cleonildo;

public interface SalaDeChatMediatorInterface {

    void enviarMensagem(String mensagem, Usuario usuario);
    void adicionarUsuario(Usuario usuario);
    void removerUsuario(Usuario usuario);
    String getNome();
}
