package com.br.study.patterns.structural.facade.sales;

public class EmailOrder {
    private final Order oder;

    public EmailOrder(Order oder) {
        this.oder = oder;
    }

    public void sendEmail(String message) {
        System.out.printf("Email sent to %s\n", "Cleonildo");
        System.out.printf("Message: %s\n", message);
    }
}
