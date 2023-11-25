package Shipping;

public class FreteExpresso implements Frete {

    @Override
    public Double calculate(Double valorPedido) {
        return valorPedido * 0.1;
    }

    @Override
    public String toString() {
        return "Express";
    }
}
