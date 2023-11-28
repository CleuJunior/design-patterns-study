package br.com.cleonildo;

public class Lampada {
    private final String identificacao;
    private boolean estado;

    public Lampada(String identificacao, boolean estado) {
        this.estado = estado;
        this.identificacao = identificacao;
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
    }

    public String getIdentificacao() {
        return this.identificacao;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void imprimeObjeto() {
        String status = "O objeto " + this.identificacao + " está " + (this.estado ? "Ligado." : "Desligado.");
        System.out.println(status);
    }
}
