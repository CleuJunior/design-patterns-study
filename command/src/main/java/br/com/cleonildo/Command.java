package br.com.cleonildo;

public interface Command {
    void executar();
    void desfazer();
}
