package com.br.study.patterns.behavioral.observer;

import com.br.study.patterns.behavioral.observer.observer.Observer;

public class Email {
    private Email() {
    }

    public static void sendEmail(Observer observer, String msg) {
        System.out.println("Email enviado para " + observer.getName() + " - " + observer.getEmail() + "\n" + "Mensagem: "
                + msg + "\n");
    }
}
