package com.devbaktiyarov.library;

import java.util.*;

import com.devbaktiyarov.library.exception.*;;

public class Library {
    private List<Book> books = new ArrayList<>();            // Список книг
    private Map<Integer, User> users = new HashMap<>();      // Карта пользователей (ID -> Пользователь)

    // Метод для добавления книги в библиотеку
    public void addBook(Book book) {
        books.add(book);
    }

    // Метод для регистрации нового пользователя
    public void registerUser(User user) {
        users.put(user.getId(), user);
    }

    // Метод для выдачи книги пользователю
    public void issueBook(int userId, int bookId) throws BookNotAvailableException, UserNotFoundException {
        User user = users.get(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found!");
        }

        Book book = null;
        for (Book b : books) {            // Проходим по списку книг
            if (b.getId() == bookId) {    // Ищем книгу по ID
                book = b;
                break;
            }
        }

        if (book == null || book.isIssued()) {
            throw new BookNotAvailableException("Book is not available!");
        }

        book.setIssued(true);            // Устанавливаем, что книга выдана
        user.issueBook(book);            // Добавляем книгу в список пользователя
    }

    // Метод для возврата книги пользователем
    public void returnBook(int userId, int bookId) throws UserNotFoundException {
        User user = users.get(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found!");
        }

        Book book = null;
        for (Book b : books) {            // Проходим по списку книг
            if (b.getId() == bookId) {    // Ищем книгу по ID
                book = b;
                break;
            }
        }

        if (book != null) {
            book.setIssued(false);       // Снимаем метку, что книга выдана
            user.returnBook(book);       // Удаляем книгу из списка у пользователя
        }
    }

    // Метод для получения списка доступных (не выданных) книг
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.isIssued()) {
                availableBooks.add(book);  // Добавляем доступные книги в новый список
            }
        }
        return availableBooks;
    }

    // Статический метод для получения общего числа книг в библиотеке
    public static int getTotalBooksCount(List<Book> books) {
        return books.size();
    }
}