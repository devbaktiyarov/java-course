package com.devbaktiyarov;

import com.devbaktiyarov.stat.StaticContext;

public class Calculator {
    public int i;

    

    public Calculator() {
        StaticContext.counter++;
    }
    public int sum(int a, int b) {
        return a+b;

    }
    public void sumVoid(int a, int b) {
        System.out.println(a+b);
    }


    public void checkValue(int value) {
        if (value < 0) {
            return; // Преждевременный выход, если значение отрицательное
            //break;
        }
        System.out.println("Value is: " + value);
    }
    
    

}
