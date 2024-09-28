package com.devbaktiyarov.oop.inheritance;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(){}

    public Student(String firstName, double averageMark) {
        this.firstName = firstName;
        this.averageMark = averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }


    int getScholarship() {
        if(this.averageMark == 5.0) {
            return 2200;
        } else {
            return 1900;
        }

        // if(averageMark == 5.0) {
        //     return 2200;
        // } 
        
        // return 1900;        
    }



    
}
