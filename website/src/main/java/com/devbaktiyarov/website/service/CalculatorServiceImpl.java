package com.devbaktiyarov.website.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add() {
        return 10+10;
    }
    
}
