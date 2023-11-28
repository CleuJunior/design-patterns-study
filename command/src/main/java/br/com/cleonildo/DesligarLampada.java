package br.com.cleonildo;

public class DesligarLampada implements Command {
    private Lampada lampada; // Precisamos saber qual lâmpada será desligada

    public DesligarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        // No método executar, chamar o método desligar() de um objeto Lampada
        this.lampada.desligar();
        // chamar o método imprimeObjeto() de um objeto Lampada para dar feedback
        this.lampada.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        // No método desfazer, chamar o método ligar() de um objeto Lampada
        this.lampada.ligar();
        // chamar o método imprimeObjeto() de um objeto Lampada para dar feedback
        this.lampada.imprimeObjeto();
    }
}

