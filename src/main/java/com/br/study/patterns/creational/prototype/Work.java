package com.br.study.patterns.creational.prototype;

public class Work implements Prototype {
    private String name;
    private String author;
    private int type;

    public Work() {
    }

    public Work(String name, String author, int type) {
        this.name = name;
        this.author = author;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public Prototype cloneType() {
        return new Work(this.name, this.author, this.type);
    }

    @Override
    public String toString() {
        return "Work{" + "name='" + name + '\'' + ", author='" + author + '\'' + ", type=" + type + '}';
    }

}
