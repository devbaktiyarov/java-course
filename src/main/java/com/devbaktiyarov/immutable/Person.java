package com.devbaktiyarov.immutable;

import java.util.Objects;

public final class Person {
    private final String name;
    private final int age;
    private final String email;

    // Конструктор
    public Person(String name, int age, String email) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Метод, который возвращает нового человека с измененным возрастом
    public Person withAge(int newAge) {
        if (newAge < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        return new Person(this.name, newAge, this.email);
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    // Переопределение equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(email, person.email);
    }

    // Переопределение hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}

