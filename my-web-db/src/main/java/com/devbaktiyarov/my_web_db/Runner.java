package com.devbaktiyarov.my_web_db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;



@Component
public class Runner implements CommandLineRunner{

    private UserRepository userRepository;
    
    @Autowired
    public Runner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Arsen");
        userRepository.save(user);

        System.out.println(userRepository.findById(2));
        userRepository.deleteById(1);
    }
    


}