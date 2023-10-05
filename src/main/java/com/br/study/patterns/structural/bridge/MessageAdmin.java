package com.br.study.patterns.structural.bridge;

public class MessageAdmin extends MessageAbstract {

    protected MessageAdmin(DispatchChannel dispatchChannel) {
        super(dispatchChannel);
    }

    @Override
    public void send() {
        System.out.println("Message sent by ADMINISTRATOR");
        super.dispatchChannel.sendMessage(super.subject, super.message);
    }
}
