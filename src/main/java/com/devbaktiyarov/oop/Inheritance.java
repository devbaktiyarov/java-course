package com.devbaktiyarov.oop;

public class Inheritance {
    public static void main(String[] args) {

        
        Student student = new Student("Arsen", "WP1/2");
        
        student.printName();

        Student student2 = new Student();
        student2.printName();


    //     Student student = new Student();

    //     String str = new String("");
    //     // Состояние обьекта
    //     student.group = "WP1/2";

    //     // Вызов метода
    //     int sum = student.sum(10, 4);
    //     System.out.println("Return " + sum);
    //     student.sumVoid(10, 4);

    //     Student student2 = new Student();
    //     student2.name = "Mars";

    //     Student student3 = new Student();
    //     student2.name = "Mars12";
    }
}
