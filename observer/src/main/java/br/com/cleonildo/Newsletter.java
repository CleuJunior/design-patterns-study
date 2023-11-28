package br.com.cleonildo;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {
    private final List<Observer> observers;
    private final List<String> mensagens;

    public Newsletter() {
        this.observers = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.mensagens.get(this.mensagens.size() - 1));
        }
    }

    public void addMensagem(String mensagem) {
        this.mensagens.add(mensagem);
        this.notifyObservers();
    }
}
