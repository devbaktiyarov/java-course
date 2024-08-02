package com.devbaktiyarov.basics;


// Циклы в Java
public class Lesson4 {
    
    /* Циклы позволяют в зависимости от определенных условий выполнять определенное действие множество раз. 
    В языке Java есть следующие виды циклов:

            for

            while

            do...while

    */

    public static void main(String[] args) {
        // Цикл for  имеет следующую структуру
        // for ([инициализация счетчика]; [условие]; [изменение счетчика]) {}
        
        int[] array = new int[5];
        array[0] = 7;
        array[1] = 10;
        array[2] = 5;
        array[3] = 17;
        array[4] = 28;

        for (int i = 0; i < array.length; i++) { // array.length - размер массива
            System.out.println("Эмелент массива с индексом " + i + " : " + array[i]);
        }
        
        System.out.println();

        /* Цикл while сразу проверяет истинность некоторого условия, 
        и если условие истинно, то код цикла выполняется */

        int i = 0;
        while (i < 10) {
            System.out.println("Цикл while i = " + i);
            i++;
        }
        System.out.println();
        /* Цикл do while сначала выполняет код цикла, а потом проверяет условие в инструкции while. 
        И пока это условие истинно, цикл повторяется. */

        int j = 0;
        do {
            System.out.println("Цикл do..while i = " + i);
            i++;
        } while(j > 10);

    }

}
