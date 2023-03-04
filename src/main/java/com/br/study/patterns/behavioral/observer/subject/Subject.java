package com.br.study.patterns.behavioral.observer.subject;

import com.br.study.patterns.behavioral.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
