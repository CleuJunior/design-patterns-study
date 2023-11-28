package br.com.cleonildo;

public class ArCondicionado {
    private final String identificacao;
    private boolean estado;
    private int temperatura;

    public ArCondicionado(String identificacao, boolean estado, int temperatura) {
        this.estado = estado;
        this.identificacao = identificacao;
        this.temperatura = temperatura;
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getIdentificacao() {
        return this.identificacao;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void imprimeObjeto() {
        String status = "O objeto " + this.identificacao + " está " + (this.estado ? "Ligado" : "Desligado");
        if (this.estado) {
            status += " a " + this.temperatura + " graus Celsius.";
        } else {
            status += ".";
        }
        System.out.println(status);
    }
}

