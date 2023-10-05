package com.br.study.patterns.structural.bridge;

public class MessageUser extends MessageAbstract {

    protected MessageUser(DispatchChannel dispatchChannel) {
        super(dispatchChannel);
    }

    @Override
    public void send() {
        System.out.println("Message sent by USER");
        super.dispatchChannel.sendMessage(super.subject, super.message);
    }
}
