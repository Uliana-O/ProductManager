package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    @Test
    public void testRemoveExistProduct(){
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
}
