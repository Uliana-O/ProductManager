package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public void testFewProductsFound() {
        ProductRepository repo = new ProductRepository();
        ProductManager ProductManager = new ProductManager(repo);

        Book book1 = new Book(1, "Венецианский купец", 100, "Шекспир");
        Book book2 = new Book(2, "Бойцовский клуб", 300, "Паланик");
        Book book3 = new Book(3, "Щегол", 600, "Тарт");
        Smartphone phone1 = new Smartphone(4, "Samsung", 300_000, "Samsung");

        ProductManager.add(book1);
        ProductManager.add(book2);
        ProductManager.add(book3);
        ProductManager.add(phone1);

        Product[] actual = ProductManager.searchBy("купец");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testNothingFound() {
        ProductRepository repo = new ProductRepository();
        ProductManager ProductManager = new ProductManager(repo);

        Book book1 = new Book(1, "Венецианский купец", 100, "Шекспир");
        Book book2 = new Book(2, "Бойцовский клуб", 300, "Паланик");
        Book book3 = new Book(3, "Щегол", 600, "Тарт");
        Smartphone phone1 = new Smartphone(4, "Samsung", 300_000, "Samsung");

        ProductManager.add(book1);
        ProductManager.add(book2);
        ProductManager.add(book3);
        ProductManager.add(phone1);

        Product[] actual = ProductManager.searchBy("моряк");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }


}