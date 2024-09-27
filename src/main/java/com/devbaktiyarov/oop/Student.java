package com.devbaktiyarov.oop;

public class Student {
    
    String name;
    String group;

    // Конструктор
    // Student("Arsen", "WP1/2");

    public Student() {}

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }


    void printName() {
        System.out.println(this.name + " " + this.group);
    }



   
    String method() {
        return "Hello 8";
    }

    void printHello() {
        System.out.println("Hello World 2024");
    }



    int sum(int a, int b) { // параметры метода
        return a+b; 
    }



    void sumVoid(int a, int b) {
        System.out.println("Hello");
    }


    


    

}
