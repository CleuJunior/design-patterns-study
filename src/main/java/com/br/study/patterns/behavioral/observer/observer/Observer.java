package com.br.study.patterns.behavioral.observer.observer;

public interface Observer {

    void update(String msg);
    String getName();
    String getEmail();
}
