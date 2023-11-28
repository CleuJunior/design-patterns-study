package br.com.cleonildo;

import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    private final List<Command> comandos = new ArrayList<>();

    /* Para um comando ser adicionado à lista de comandos do aplicativo, ele precisa
    implementar a interface Command, assim sabemos que ele possui o método executar(). */
    public int setComando(Command comando) {
        comandos.add(comando);
        // Retorna para o cliente a posição do array em que o comando foi inserido.
        return comandos.size() - 1;
    }

    /* Método que será chamado sempre um botão for pressionado na interface do aplicativo.
    O botão precisa passar o índice do comando a ser executado. */
    public void aoPrecionarBotao(int id) {
        comandos.get(id).executar();
    }

    /* Método que será chamado sempre um botão for pressionado
    duas vezes rapidamente na interface do aplicativo.
    O botão precisa passar o índice do comando a ser desfeito. */
    public void duploCliqueBotao(int id) {
        comandos.get(id).desfazer();
    }

    // Retorna um comando do aplicativo.
    public Command getComando(int id) {
        return comandos.get(id);
    }
}

