package com.devbaktiyarov.oop.inheritance;

public class Aspirant extends Student{

    @Override
    int getScholarship() {
        if(averageMark == 5.0) {
            return 2500;
        } else {
            return 2200;
        }
    }
    
    
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("A", 4.2);
        students[1] = new Student("B", 5.0);
        students[2] = new Student("C", 4.3);
        students[3] = new Student("D", 3.4);
        students[4] = new Student("E", 5.0);
        
        for(Student student : students) {
            System.out.println(student.firstName + " - " + student.getScholarship());
        }
    }

}
