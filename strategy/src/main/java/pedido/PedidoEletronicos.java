package pedido;

import Shipping.Frete;

public class PedidoEletronicos extends Pedido {
    private String nomeSetor;

    public PedidoEletronicos() {
        this.nomeSetor = "Eletrônicos";
    }

    public PedidoEletronicos(Double value, Frete frete) {
        super(value, frete);
    }

    public PedidoEletronicos(String nomeSetor, Double value, Frete tipoFrete) {
        super(value, tipoFrete);
        this.nomeSetor = nomeSetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    @Override
    public String toString() {
        return "PedidoEletronicos:" +
                "\nsetorNome=" + this.nomeSetor + ",\n" +
                "valor=" + super.getValor() + ",\n" +
                "Frete=" + super.getTipoFrete() + ",\n" +
                "Valor Freete=" + super.calculaFrete() + "\n";
    }
}
