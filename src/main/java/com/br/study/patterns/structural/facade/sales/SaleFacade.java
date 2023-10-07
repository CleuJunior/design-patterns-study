package com.br.study.patterns.structural.facade.sales;

import com.br.study.patterns.structural.facade.Consumer;
import com.br.study.patterns.structural.facade.Product;
import com.br.study.patterns.structural.facade.sales.payment.Payment;
import com.br.study.patterns.structural.facade.sales.payment.PaymentBillet;
import com.br.study.patterns.structural.facade.sales.payment.PaymentCredit;

public class SaleFacade {
    private final Order order;
    private Payment payment;
    private final EmailOrder emailOrder;

    public SaleFacade(Consumer consumer) {
        this.order = new Order(consumer);
        this.emailOrder = new EmailOrder(this.order);
    }

    public void addProduct(Product product) {
        this.order.addProduct(product);
    }

    public void orderCredit() {
        this.payment = new PaymentCredit(this.order);

        if (this.payment.doPayment()) {
            this.emailOrder.sendEmail("Payement success by credit");
        } else {
            this.emailOrder.sendEmail("Something went wrong");
        }
    }

    public void orderBillet() {
        this.payment = new PaymentBillet(this.order);

        if (this.payment.doPayment()) {
            this.emailOrder.sendEmail("Payement success by billet");
        } else {
            this.emailOrder.sendEmail("Something went wrong");
        }
    }
}
