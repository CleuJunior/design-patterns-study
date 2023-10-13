package com.br.study.patterns.creational.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrototypeManager {
    private final Map<String, Prototype> prototypes = new HashMap<>();

    public PrototypeManager() {
        Book book = new Book("Unknow", "Unknow", 0);
        Magazine magazine = new Magazine("Unknow", "Unknon");
        Work work = new Work("Unknow", "Unknow", 0);

        this.prototypes.put("Book", book);
        this.prototypes.put("Magazine", magazine);
        this.prototypes.put("Work", work);

    }

    public Prototype getInstance(String identifier) {
        return this.prototypes.get(identifier);
    }
}
