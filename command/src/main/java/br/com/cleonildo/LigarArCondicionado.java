package br.com.cleonildo;

public class LigarArCondicionado implements Command {
    private final ArCondicionado arCondicionado; // O ar-condicionado que será ligado.

    public LigarArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void executar() {
        // No método executar, chamar o método ligar() de um objeto ArCondicionado
        this.arCondicionado.ligar();
        // No método executar, chamar o método ligar() de um objeto ArCondicionado
        this.arCondicionado.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        // No método desfazer, chamar o método desligar() de um objeto ArCondicionado
        this.arCondicionado.desligar();
        // chamar o método imprimeObjeto() de um objeto ArCondicionado para dar feedback
        this.arCondicionado.imprimeObjeto();
    }
}

