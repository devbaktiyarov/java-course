package com.devbaktiyarov.library;

import java.util.*;

class User {
    private static int idCounter = 1;   // Статическое поле для генерации уникальных ID
    private int id;                     // Уникальный ID пользователя
    private String name;                // Имя пользователя
    private List<Book> issuedBooks;     // Список взятых книг

    public User(String name) {
        this.id = idCounter++;          // Присваиваем уникальный ID и увеличиваем счетчик
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void issueBook(Book book) {
        issuedBooks.add(book);          // Добавляем книгу в список взятых книг
    }

    public void returnBook(Book book) {
        issuedBooks.remove(book);       // Удаляем книгу из списка взятых книг
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + "', issuedBooks=" + issuedBooks + "}";
    }
}

