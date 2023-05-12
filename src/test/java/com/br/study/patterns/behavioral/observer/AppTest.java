package com.br.study.patterns.behavioral.observer;

import com.br.study.patterns.behavioral.observer.notified.Client;
import com.br.study.patterns.behavioral.observer.notified.Employee;
import com.br.study.patterns.behavioral.observer.notified.Partner;
import com.br.study.patterns.behavioral.observer.notified.Supplier;
import com.br.study.patterns.behavioral.observer.observer.Observer;
import com.br.study.patterns.behavioral.observer.service.Newsletter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {

    private Observer client;
    private Observer client2;
    private Observer employee;
    private Observer partner;
    private Observer supplier;
    private Newsletter newsletter;

    @Before
    public void beforeEach() {
        newsletter = new Newsletter();
        client = new Client("Client01", "client01@email.com", newsletter);
        client2 = new Client("Client02", "client02@email.com", newsletter);
        employee = new Employee("Employee", "employee@email.com", newsletter);
        partner = new Partner("Partner", "partner@email.com", newsletter);
        supplier = new Supplier("Partner", "partner@email.com", newsletter);
    }

    @Test
    public void testObservers() {
        newsletter.addMessage("Primeira mensagem");
        newsletter.removeObserver(client2);
        System.out.println("##############\n");
        newsletter.addMessage("Observador 2 saiu da lista");
        System.out.println("##############\n");
        newsletter.removeObserver(partner);
        newsletter.addMessage("Parceiro saiu");
    }
}
