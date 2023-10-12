package com.br.study.patterns.structural.adpter;

import com.br.study.patterns.structural.adpter.thirdparty.PagFacil;
import com.br.study.patterns.structural.adpter.thirdparty.TopPagamentos;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class App {
    private final PagFacil pagFacil = new PagFacil();
    private final PagFacilAdapter pagFacilAdapter = new PagFacilAdapter();
    private final TopPagamentos topPagamentos = new TopPagamentos();
    private final TopPagamentoslAdapter topPagamentoslAdapter = new TopPagamentoslAdapter(topPagamentos);
    private final Charge charge = new Charge(pagFacilAdapter);

    @Test
    public void simpleTest() {
        charge.setValue(BigDecimal.valueOf(100));
        charge.setInstallment(3);
        charge.setCardNumber("881726399183441");
        charge.setCvv("123");

        charge.doPayment();

        charge.setGateway(topPagamentoslAdapter);
        charge.setValue(BigDecimal.valueOf(100));
        charge.setInstallment(3);
        charge.setCardNumber("881726399183441");
        charge.setCvv("123");

        charge.doPayment();

        assertTrue(true);
    }

}