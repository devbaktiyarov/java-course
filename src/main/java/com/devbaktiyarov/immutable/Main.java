package com.devbaktiyarov.immutable;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "alice@example.com");
        System.out.println(person); // Вывод: Person{name='Alice', age=30, email='alice@example.com'}

        // Создание нового объекта с измененным возрастом
        Person person2 = person.withAge(31);
        System.out.println(person2); // Вывод: Person{name='Alice', age=31, email='alice@example.com'}
        
        // Исходный объект остается неизменным
        System.out.println(person); // Вывод: Person{name='Alice', age=30, email='alice@example.com'}
    }
}

