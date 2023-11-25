package Shipping;

public class FreteComum implements Frete {

    @Override
    public Double calculate(Double valorPedido) {
        return valorPedido * 0.05;
    }

    @Override
    public String toString() {
        return "Common";
    }
}
