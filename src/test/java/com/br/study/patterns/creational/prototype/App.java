package com.br.study.patterns.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class App {
    private final Prototype bookPrototype = new PrototypeManager().getInstance("Book");
    private final Book book = (Book) bookPrototype.cloneType();

    @Test
    public void simpleTest() {
        System.out.println("Book default values");
        System.out.println(book);
        System.out.println();


        book.setName("Book 1");
        book.setAuthor("Ferdinandis Marcos");
        book.setNumberOfPages(337);

        System.out.println("Book Edited");
        System.out.println(book);

        assertTrue(true);
    }

}