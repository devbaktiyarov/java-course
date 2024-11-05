package com.devbaktiyarov.basics;

// Типы данных в Java
public class Lesson2 {
    public static void main(String[] args) {

        // 248163264

        /*
         * В Java типы данных делят на две большие группы: примитивные и ссылочные.
         * В состав примитивных типов (или просто примитивов) входят четыре подвида и
         * восемь типов данных:
         * 1) целые числа (byte, short, int, long);
         * 2) числа с плавающей точкой (float, double);
         * 3) логический (boolean);
         * 4) символьный (char).
         * Ссылочные типы данных ещё называют ссылками.
         * К ним относятся все классы, интерфейсы, массивы, а также тип данных String.
         */

        /* Массивы — это структура данных, в которой хранятся элементы одного типа. 
        Его можно представить, как набор пронумерованных ячеек, в каждую из которых 
        можно поместить какие-то данные (один элемент данных в одну ячейку).
        Доступ к конкретной ячейке осуществляется через её номер. 
        Номер элемента в массиве также называют индексом 
        Первый элемент массива начинается всегда с нуля*/
        int[] array = new int[5];
        // 0 1 2 3 4
        array[0] = 7;
        array[1] = 2;
        array[2] = 10;
        array[3] = 8;
        array[4] = 3;

        System.out.println("Первый элемент массива " + array[0]); // обращаемся к первому элементу массива 
        System.out.println(array[2]);
        // Обьяляем переменные
        // тип_данных имя_переменной

        String name = "Arsen";
        int age = 18; // Возраст
        double weight = 70.5; // Вес
        short height = 175; // Рост
        boolean isStudent = true; // Является ли человек студентов true или false
        float grade = 4.3f; // Оценка

        System.out.println("Имя " + name);

        System.out.println("Имя " + name + "\n" + "Возраст " + age + "\n" +
                "Вес " + weight + "\n" + "Рост " + height + "\n" +
                "Студент " + isStudent + "\n" + "Оценка " + grade); // \n - новая строка
        System.out.println();
        weight = 90.5;

        System.out.println("Вес " + weight);
        // Создаем свой ссылочный тип данных 
        class Developer {
            String name = "Name";
            String programmingLanguage = "Java";
        }

        // Создание обьекта ссылочного типа
        Developer developer = new Developer();
        System.out.println(developer.name);
        System.out.println(developer.programmingLanguage);
        
        // Изменим значение переменной своим именем
        developer.name = "Arsen";
        System.out.println(developer.name);
        System.out.println();


        /* Инкремент — это операция, в результате которой значение переменной увеличивается на единицу. 
        В коде она обозначается как «++", то есть двумя знаками плюса.

        Декремент — это операция, в результате которой значение переменной уменьшается на единицу. 
        Обозначение в коде соответствует двум минусам и выглядит как «--". */

        int i = 7;
        int d = 10;
        i++;
        System.out.println("Инкремент " + i);
        d--;
        System.out.println("Декремент " + i);
        System.out.println( );

        int inc = 10;
        System.out.println("Посфиксный инкремент " + inc++);
        System.out.println("Префиксный инкремент " + ++inc);
        
        int dec = 7;
        System.out.println("Посфиксный декремент " + dec--);
        System.out.println("Префиксный декремент " + --dec);


        // Арифметические операции
        int a = 125;
        int b = 15;

        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        double div = a / b;

        System.out.println("Cумма " + sum);
        System.out.println("Разность " + diff);
        System.out.println("Произведение " + mult);
        System.out.println("Частное " + div);

        System.out.println();
        // Операции сравнения
        System.out.println(a <= b);

        System.out.println(a >= b);

        System.out.println(a == b);

        System.out.println(a != b); // Оператор != не равны

    }
}
