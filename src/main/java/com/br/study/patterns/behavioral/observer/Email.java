package com.br.study.patterns.behavioral.observer;

import com.br.study.patterns.behavioral.observer.observer.Observer;

public class Email {
    private Email() {
    }

    public static String sendEmail(Observer observer) {
        return "Email enviado para " + observer.getName() + " - " + observer.getEmail() + "\n" +
                "Mensagem: " + observer.update() + "\n";
    }
}
