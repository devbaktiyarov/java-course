package com.plit.wp.demo_project;

import org.springframework.stereotype.Component;

@Component
public class ServiceA {
   
    public void sayHello() {
        System.out.println("ServiceB calls ServiceA");
    }
    
}
