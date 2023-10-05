package com.br.study.patterns.structural.bridge;

public abstract class MessageAbstract {
    protected DispatchChannel dispatchChannel;
    protected String subject;
    protected String message;

    protected MessageAbstract(DispatchChannel dispatchChannel) {
        this.dispatchChannel = dispatchChannel;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract void send();
}
