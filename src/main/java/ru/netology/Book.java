package ru.netology;
public class Book extends Product {

    private String name;
    private String author;
    private int price;
    private int id;



    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;

    }

}

