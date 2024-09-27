package com.devbaktiyarov.basics;

// Условные конструкции
public class Lesson3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int sum = a + b;

        /* После ключевого слова if ставится условие. 
        И если это условие выполняется, то срабатывает код, который помещен в далее 
        в блоке if после фигурных скобок. 
        В качестве условий выступает операция сравнения двух чисел. */
        /*  if (condition) {
            
            } else if(condition) {
            
            } else {
             
            } 
            */

            int i = 4;

        if (sum > 30 || i==5 ) {
            System.out.println("Сумма больше 30");
        } else if (sum < 30) {
            System.out.println("Сумма меньше 30");
        } else {
            System.out.println("Cумма равна 30");
        }

        // Конструкция switch/case аналогична конструкции if/else, 
        // так как позволяет обработать сразу несколько условий:
        // Ключевое слово break останавливает код при правильном значение
       
        // switch (args) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

        String lang = "Java";
        
        // С break

        // System.out.println("\nБез ключевого слова break");
    
        switch (lang) {
            case "C++":
                System.out.println("Язык программирования C++");
                // Ключевое слово break останавливает код при правильном значение
            case "Javac":
                System.out.println("Язык программирования Java");
                break;
            case "Javascript":
                System.out.println("Язык программирования Javascript");
                break;
            case "C#":
                System.out.println("Язык программирования C#");
                break;
            default:
                System.out.println("Не найдено");
                break;
        }

        // Без break
        System.out.println("\nБез ключевого слова break");
        
        switch (lang) {
            case "Java":
                System.out.println("Язык программирования Java");

            case "C++":
                System.out.println("Язык программирования C++");
            
            case "Javascript":
                System.out.println("Язык программирования Javascript");
            
            case "C#":
                System.out.println("Язык программирования C#");

        }


    }
}
