package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    @Test
    public void testRemoveExistProduct() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Венецианский купец", 100, "Шекспир");
        Book book2 = new Book(2, "Бойцовский клуб", 300, "Паланик");
        Book book3 = new Book(3, "Щегол", 600, "Тарт");
        Smartphone phone1 = new Smartphone(4, "Samsung", 300_000, "Samsung");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.removeById(3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, phone1};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void testAddProduct() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Венецианский купец", 100, "Шекспир");
        Book book2 = new Book(2, "Бойцовский клуб", 300, "Паланик");
        Book book3 = new Book(3, "Щегол", 600, "Тарт");
        Smartphone phone1 = new Smartphone(4, "Samsung", 300_000, "Samsung");
        Smartphone phone2 = new Smartphone(5, "Apple", 800_000, "Apple");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.add(phone2);


        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3, phone1, phone2};

        Assertions.assertArrayEquals(actual, expected);


    }

    @Test
    public void testRemoveFewProducts() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Венецианский купец", 100, "Шекспир");
        Book book2 = new Book(2, "Бойцовский клуб", 300, "Паланик");
        Book book3 = new Book(3, "Щегол", 600, "Тарт");
        Smartphone phone1 = new Smartphone(4, "Samsung", 300_000, "Samsung");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.removeById(3);
        repo.removeById(1);

        Product[] actual = repo.findAll();
        Product[] expected = {book2, phone1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void testRemoveAllProduct() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Венецианский купец", 100, "Шекспир");
        Book book2 = new Book(2, "Бойцовский клуб", 300, "Паланик");
        Book book3 = new Book(3, "Щегол", 600, "Тарт");
        Smartphone phone1 = new Smartphone(4, "Samsung", 300_000, "Samsung");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.removeById(1);
        repo.removeById(2);
        repo.removeById(3);
        repo.removeById(4);

        Product[] actual = repo.findAll();
        Product[] expected = {};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void testRemoveBooks() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Венецианский купец", 100, "Шекспир");
        Book book2 = new Book(2, "Бойцовский клуб", 300, "Паланик");
        Book book3 = new Book(3, "Щегол", 600, "Тарт");
        Smartphone phone1 = new Smartphone(4, "Samsung", 300_000, "Samsung");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.removeById(1);
        repo.removeById(2);
        repo.removeById(3);

        Product[] actual = repo.findAll();
        Product[] expected = {phone1};

        Assertions.assertArrayEquals(actual, expected);
    }
}
