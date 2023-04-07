package ru.netology;
public class Smartphone extends Product {
    private  String name;
    private  String  vendor;
    private int price;
    private int id;

    public Smartphone(int id, String name, int price, String vendor) {
        super(id, name, price);
        this.vendor = vendor;


    }
}
