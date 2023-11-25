package pedido;

import Shipping.Frete;

public abstract class Pedido {

    protected Double valor;
    protected Frete tipoFrete;

    public Pedido() {
    }

    protected Pedido(Double valor, Frete tipoFrete) {
        this.valor = valor;
        this.tipoFrete = tipoFrete;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Frete getTipoFrete() {
        return this.tipoFrete;
    }

    public void setTipoFrete(Frete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public Double calculaFrete() {
        return this.tipoFrete.calculate(this.valor);
    }
}
