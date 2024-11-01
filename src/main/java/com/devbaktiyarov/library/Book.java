package com.devbaktiyarov.library;

class Book {
    private static int idCounter = 1;  // Статическое поле для генерации уникальных ID
    private int id;                    // Уникальный ID книги
    private String title;              // Название книги
    private String author;             // Автор книги
    private boolean isIssued;          // Флаг: выдана ли книга

    public Book(String title, String author) {
        this.id = idCounter++;         // Присваиваем уникальный ID и увеличиваем счетчик
        this.title = title;
        this.author = author;
        this.isIssued = false;         // Книга по умолчанию не выдана
    }

    public int getId() {
        return id;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        this.isIssued = issued;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title='" + title + "', author='" + author + "'}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + (isIssued ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return id == book.id;
    }

 

}

