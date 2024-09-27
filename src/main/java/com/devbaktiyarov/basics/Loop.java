package com.devbaktiyarov.basics;

import java.util.Arrays;
import java.util.Collections;

public class Loop {
    public static void main(String[] args) {
        
        // for (int i = 0; i < 10; i++){
            
        //     if (i == 5) { // 5 == 5
        //         // continue; 
        //         break;
        //     }

        //     // ------------------------------------
           
        //     System.out.println(i);
        // }
        Integer[] array = new Integer[5]; // {7, 10, 5 17, 28}
        array[0] = 7; 
        array[1] = 10;
        array[2] = 5;
        array[3] = 17;
        array[4] = 28;

    
        for (int i : array) {
            System.out.println("Element: " + i);
        }
 
        
        // for (int i = 0; i < array.length; i++) { // array.length - размер массива
        //     System.out.println("Эмелент массива с индексом " + i + " " + array[i]);
        // }
    }
}
