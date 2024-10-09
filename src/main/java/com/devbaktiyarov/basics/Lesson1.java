// Путь к файлу
package com.devbaktiyarov.basics;

import java.util.ArrayList;
import java.util.List;

// Lesson1 название класса
// Название класса и файла должны совпадать
public class Lesson1 {

    // Метод main точка входа в программу 
    public static void main(String[] args) {
        
        List<Integer>  arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(332);
        arraylist.add(1212);
        arraylist.add(133);
        arraylist.add(99);
        arraylist.add(333);

        System.out.println(arraylist.get(3));
        System.out.println(arraylist.indexOf(99));
        System.out.println(arraylist.remove(3));
        System.out.println(arraylist.get(3));

        arraylist.add(3, 77);

        System.out.println(arraylist.get(3));
        
        

        System.out.println("Hello students 2024!"); // Выводит строку на консоль
    }
}
