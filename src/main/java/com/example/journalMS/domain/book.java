package com.example.journalMS.domain;

public class book {
    private int id;
    private int price;
    private String name;
    private String ISBN;
    private String publisher;

    public book(){

    }

    public book(int id, int price, String name, String ISBN, String publisher) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.ISBN = ISBN;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
