package com.plit.wp.demo_project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;



@Component
public class Runner implements CommandLineRunner{

    private ServiceB serviceB;

    @Autowired
    public Runner(ServiceB serviceB) {
        this.serviceB = serviceB;
    }


    @Override
    public void run(String... args) throws Exception {
        serviceB.callServiceA();
    }
    


}
