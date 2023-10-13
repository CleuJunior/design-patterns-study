package com.br.study.patterns.creational.prototype;

public class Magazine implements Prototype {
    private String name;
    private String edition;

    public Magazine() {
    }

    public Magazine(String name, String edition) {
        this.name = name;
        this.edition = edition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public Prototype cloneType() {
        return new Magazine(this.name, this.edition);
    }

    @Override
    public String toString() {
        return "Magazine{" + "name='" + name + '\'' + ", edition='" + edition + '\'' + '}';
    }

}
