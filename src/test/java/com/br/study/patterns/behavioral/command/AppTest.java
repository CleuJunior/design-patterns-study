package com.br.study.patterns.behavioral.command;

import com.br.study.patterns.behavioral.command.manufacturer.AirConditioning;
import com.br.study.patterns.behavioral.command.manufacturer.Bulb;
import org.junit.Test;

public class AppTest {

    @Test
    public void testBulbOne() {
        Bulb roomBulb = new Bulb("Room", false);

        roomBulb.on();
        System.out.println(roomBulb);
        roomBulb.off();
        System.out.println(roomBulb);
    }

    @Test
    public void testBulbTwo() {
        Bulb bedroomBulb = new Bulb("Bedroom", false);

        bedroomBulb.on();
        System.out.println(bedroomBulb);
        bedroomBulb.off();
        System.out.println(bedroomBulb);
    }

    @Test
    public void airConditioning() {
        AirConditioning roomAirConditioning = new AirConditioning("Room", false, 24);

        roomAirConditioning.on();
        System.out.println(roomAirConditioning);
        roomAirConditioning.setTemperature(19);
        System.out.println(roomAirConditioning);
        roomAirConditioning.off();
        System.out.println(roomAirConditioning);
    }
}