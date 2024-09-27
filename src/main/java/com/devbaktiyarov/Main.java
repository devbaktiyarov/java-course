package com.devbaktiyarov;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // int i;
        // i = 20;

        // // let i = 20;
        // // i = "Srt";

        // var h = "Str";
        // System.out.println(h);

        // final String NAME = "Арсен";
        // // NAME = "Ar";
        // System.out.println("Имя: " + NAME);
        

        // int age = 22;
        // System.out.println("Возраст: " + age);


        // char a = 97;
        // System.out.println("CHAR: " + a);

        // double weight = 70.5; // Вес
        // short height = 175; // Рост
        // boolean isStudent = true; // Является ли человек студентов true или false
        // boolean hasAutority = false;
        // float grade = 4.3f; // Оценка



        // json

        // {
        //     name: "Arsen",
        //     age: 22,
            //    array: [
            //     {name: "Baktiyarov"}
            //    ]
        //     email: "a@gmail.com",
        //     password: "3284873264813784"
        // }



        // System.out.println(i);


        int[] array = new int[5]; // O(1)
        
        array[0] = 1;
        array[1] = 1;
        array[2] = 0;
        array[3] = 2;
        array[4] = 3;
        for(int i = 0; i < array.length; i++) { // O(n) n = 5
            if(array[i] > 5) {
                System.out.println("Массив array[i]: " + array[i]);
            }
        }
   // 2 O(n)
        for (int i : array) {
            if(i > 5) {
                System.out.println("Foreach массив array[i]: " + i);
            }
        }

        }
}