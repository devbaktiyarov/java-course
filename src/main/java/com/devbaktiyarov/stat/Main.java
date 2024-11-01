package com.devbaktiyarov.stat;

import com.devbaktiyarov.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 3));
        Calculator calculator = new Calculator();
        calculator.sum(0, 2);
        calculator.i++;

        Calculator calculator2 = new Calculator();
        calculator2.i += 3;

        System.out.println(calculator.i);

        System.out.println(calculator2.i);
        


        System.out.println(StaticContext.counter++);
        StaticContext.print();




        System.out.println("_-----------");

        StaticContext.counter++;

        System.out.println(StaticContext.counter);

        StaticContext.print();

        int sum = StaticContext.sum(5, 6);
        System.out.println(sum);

        int max = Math.max(4, 10);
        System.out.println(max);

        StaticContext.arr[0] = 10;
        StaticContext.arr[1] = 5;
        StaticContext.arr[2] = 1;

        int[] array = StaticContext.arr;
        
        System.out.println(array[1]);

    }   
}
