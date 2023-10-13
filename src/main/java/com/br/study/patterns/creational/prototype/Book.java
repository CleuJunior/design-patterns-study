package com.br.study.patterns.creational.prototype;

public class Book implements Prototype {
    private String name;
    private String author;
    private int numberOfPages;

    public Book() {
    }

    public Book(String name, String author, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public Prototype cloneType() {
        return new Book(this.name, this.author, this.numberOfPages);
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + ", numberOfPages=" + numberOfPages + '}';
    }

}
