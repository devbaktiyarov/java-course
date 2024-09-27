package com.devbaktiyarov.basics;

public class Main {
    public static void main(String[] args) {
        // int i = 100;
        // int b = 100000;
        // System.out.println(i);
        // System.out.println(b);
        // boolean tf = true;
        // System.out.println(tf);   


        // String name = "Ars";

        // String surname = new String("Bak");
        
        // System.out.println(name);
        // System.out.println(surname);

        int i = 25;
        int j = 7;
        int d = i % j;

        System.out.println(i-j);
        System.out.println(i+j);
        System.out.println(i*j);
        System.out.println("D: " + d);


        int m = 3;
        // m+=7;
        m = m + 7;

        System.out.println("Пост " + m++);
        System.out.println("Значение " + m);
        
        int n = 7;
        System.out.println("Пре n = " + n++);
        System.out.println("Значение n = " + n);

        m++;
        // ++m;
        // m++;
        System.out.println(m);

        int a = 8;
        int b = a--;
        // b = 8 ... 8++ a = 9
        // b = 8 ... 8-- a = 7
        System.out.println(b);
        System.out.println(a);


        int sum = 30;
        int k = 8;

        if (sum < 30 || k == 8 ) {
            System.out.println("Сумма больше 30");
        } else if (sum < 30) {
            System.out.println("Сумма меньше 30");
        } else {
            System.out.println("Cумма равна 30");
        }

        boolean ai = true;
        boolean bi = false;
        System.out.println(ai & bi);



        boolean aij = true;
        boolean bij = false;
        System.out.println(aij | bij);


    }
}
