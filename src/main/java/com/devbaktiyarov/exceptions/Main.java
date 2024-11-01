package com.devbaktiyarov.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, null);

            // try {
            //     user.setEmail("Urrrr");
            // } catch (EmailInvalidException e) {
            //     System.out.println("Исключение");
            // } catch (UserNotActiveException e) {
            //     System.out.println("Исклбчение 2");
            // } 

             try {
                user.setEmail("Urrrr");
            } catch (Exception e) {
                System.out.println("Исключение");
            }


        

        System.out.println("------------------");
    }
    
}
