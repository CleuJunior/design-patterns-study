package com.br.study.patterns.behavioral.observer.notified;

import com.br.study.patterns.behavioral.observer.Email;
import com.br.study.patterns.behavioral.observer.observer.Observer;
import com.br.study.patterns.behavioral.observer.subject.Subject;

public class Client implements Observer {
    private String name;
    private String email;
    private Subject subject;

    public Client(String name, String email, Subject subject) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String update(String message) {
        return Email.sendEmail(this, message);
    }
}
