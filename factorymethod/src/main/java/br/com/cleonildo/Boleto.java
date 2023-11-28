package br.com.cleonildo;

public abstract class Boleto {
    protected float valor;
    protected float juros;
    protected float desconto;
    protected float multa;

    public Boleto(float valor) {
        this.valor = valor;
    }

    // Calcula o valor do Juros do boleto.
    public float calcularJuros() {
        return this.valor * this.juros;
    }

    // Calcula o valor do Desconto do boleto.
    public float calcularDesconto() {
        return this.valor * this.desconto;
    }

    // Calcula o valor da Multa do boleto.
    public float calcularMulta() {
        return this.valor * this.multa;
    }
}
