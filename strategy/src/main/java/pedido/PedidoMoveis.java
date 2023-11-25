package pedido;

import Shipping.Frete;

public class PedidoMoveis extends Pedido {
    private String setorNome;

    public PedidoMoveis() {
        this.setorNome = "Móveis";
    }

    public PedidoMoveis(Double value, Frete tipoFrete) {
        super(value, tipoFrete);
    }

    public PedidoMoveis(String setorNome, Double value, Frete tipoFrete) {
        super(value, tipoFrete);
        this.setorNome = setorNome;
    }

    public String getSetorNome() { return setorNome; }

    public void setSetorNome(String setorNome) { this.setorNome = setorNome; }

    @Override
    public String toString() {
        return "PedidoMoveis:" +
                "\nsectorName=" + this.setorNome + ",\n" +
                "Value=" + super.getValor() + ",\n" +
                "Frete=" + super.getTipoFrete() + ",\n" +
                "Frete value=" + super.calculaFrete() + "\n";
    }
}
