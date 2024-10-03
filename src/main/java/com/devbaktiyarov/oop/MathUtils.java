package com.devbaktiyarov.oop;

class MathUtils {
    // Перегрузка метода add
    int add(int a, int b) {return a + b;}
 
    double add(double a, double b) {return a + b;}
 
    int add(int a, int b, int c) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        
        printArray(arr);
        
        return a + b + c;
    }


    String add(String a, String b) {
        print();
        return a+b;
    }


    String add(String a, String b, String c, String d) {
        return a+b+c+d;
    }

    void print() {
        System.out.println("Hello Print");
    }


    void print(String a) {
        System.out.println(a);
    }



    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }



    


 }
 
