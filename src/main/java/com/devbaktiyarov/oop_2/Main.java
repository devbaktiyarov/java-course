package com.devbaktiyarov.oop_2;

public class Main {
    
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("E");
        System.out.println(student.getName());

        System.out.println();

        BankAccount account = new BankAccount();

        System.out.println();
        System.out.println(account.getBalance());
        System.out.println();

        account.setNumber("21863263");
        account.setBalance(777);
        account.deposit(333);

        System.out.println(account.getBalance());

        account.withdraw(32);

        System.out.println(account.getBalance());

    }

}
