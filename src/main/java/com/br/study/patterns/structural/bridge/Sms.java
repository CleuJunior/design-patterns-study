package com.br.study.patterns.structural.bridge;

public class Sms implements DispatchChannel {
    @Override
    public void sendMessage(String subject, String message) {
        System.out.println("===Message sent by SMS===");
        System.out.println("Subject: " + subject);
        System.out.println("-----------------");
        System.out.println("MESSAGE: " + message);
    }
}
