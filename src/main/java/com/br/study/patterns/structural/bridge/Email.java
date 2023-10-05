package com.br.study.patterns.structural.bridge;

public class Email implements DispatchChannel {
    @Override
    public void sendMessage(String subject, String message) {
        System.out.println("===Message sent by EMAIL===");
        System.out.println("Subject: " + subject);
        System.out.println("-----------------");
        System.out.println("MESSAGE: " + message);
    }
}
