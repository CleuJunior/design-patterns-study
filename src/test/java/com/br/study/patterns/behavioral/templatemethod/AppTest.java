package com.br.study.patterns.behavioral.templatemethod;

import com.br.study.patterns.behavioral.templatemethod.gateway.Gateway;
import com.br.study.patterns.behavioral.templatemethod.payment.Payment;
import com.br.study.patterns.behavioral.templatemethod.payment.PaymentCash;
import com.br.study.patterns.behavioral.templatemethod.payment.PaymentCredit;
import com.br.study.patterns.behavioral.templatemethod.payment.PaymentDebit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AppTest {
    private final double valueForTests = 1000.0;
    private final Gateway gateway = new Gateway();
    private final Payment cash = new PaymentCash(valueForTests, gateway);
    private final Payment debit = new PaymentDebit(valueForTests, gateway);
    private final Payment credit = new PaymentCredit(valueForTests, gateway);

    @Test
    public void calculateCollectsForCashDebitAndCredit() {
        Double expectedForCash = 900.0;
        Double expectedDebit = 954.0;
        Double expectedCredit = 1030.0;

        assertEquals(expectedForCash, cash.collects());
        assertEquals(expectedDebit, debit.collects());
        assertEquals(expectedCredit, credit.collects());
    }

    @Test
    public void shouldReturnTrueForDifferentFee() {
        assertNotEquals(cash.calculateFee(), debit.calculateFee());
        assertNotEquals(cash.calculateFee(), credit.calculateFee());
        assertNotEquals(debit.calculateFee(), credit.calculateFee());
    }
}
