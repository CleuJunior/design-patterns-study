package com.br.study.patterns.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class App {
    private final DispatchChannel channelEmail = new Email();
    private final DispatchChannel channelSms = new Sms();

    @Test
    public void simlpeTest() {
        MessageAbstract messageAdminEmail = new MessageAdmin(this.channelEmail);
        messageAdminEmail.setSubject("First message");
        messageAdminEmail.setMessage("Hello User");
        messageAdminEmail.send();

        System.out.println();

        MessageAbstract messageUserEmail = new MessageUser(this.channelEmail);
        messageUserEmail.setSubject("First message");
        messageUserEmail.setMessage("Hello Admin");
        messageUserEmail.send();

        System.out.println();

        MessageAbstract messageAdminSms = new MessageAdmin(this.channelSms);
        messageAdminSms.setSubject("Second message");
        messageAdminSms.setMessage("Hello User");
        messageAdminSms.send();

        System.out.println();

        MessageAbstract messageUserSms = new MessageUser(this.channelSms);
        messageUserSms.setSubject("Second message");
        messageUserSms.setMessage("Hello Admin");
        messageUserSms.send();

        assertTrue(true);
    }

}