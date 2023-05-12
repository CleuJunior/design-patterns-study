package com.br.study.patterns.behavioral.observer.service;

import com.br.study.patterns.behavioral.observer.observer.Observer;
import com.br.study.patterns.behavioral.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final List<String> messages = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        int lastMessageIndex = this.messages.size() -1;
        this.observers.forEach(observer -> observer.update(this.messages.get(lastMessageIndex)));
    }

    public void addMessage(String message) {
        this.messages.add(message);
        this.notifyObservers();
    }
}
