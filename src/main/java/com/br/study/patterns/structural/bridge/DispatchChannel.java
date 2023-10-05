package com.br.study.patterns.structural.bridge;

public interface DispatchChannel {
    void sendMessage(String subject, String message);
}
