package br.com.cleonildo;

public class DesligarArCondicionado implements Command {
    private final ArCondicionado arCondicionado; // O ar-condicionado que será desligado.

    public DesligarArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        // No método executar, chamar o método desligar() de um objeto ArCondicionado
        this.arCondicionado.desligar();
        // No método executar, chamar o método ligar() de um objeto ArCondicionado
        this.arCondicionado.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        // No método desfazer, chamar o método ligar() de um objeto ArCondicionado
        this.arCondicionado.ligar();
        // chamar o método imprimeObjeto() de um objeto ArCondicionado para dar feedback
        this.arCondicionado.imprimeObjeto();
    }
}
