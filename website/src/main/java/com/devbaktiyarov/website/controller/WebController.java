package com.devbaktiyarov.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbaktiyarov.website.componets.Print;
import com.devbaktiyarov.website.service.CalculatorService;
import com.devbaktiyarov.website.service.NameService;



@RestController
@RequestMapping("/rest/v1")
public class WebController {

    private Print printer;

    public WebController(Print printer) {
        this.printer = printer;
    }


    // private CalculatorService service;

    // public WebController(Print printer, CalculatorService service) {
    //     this.printer = printer;
    //     this.service = service;
    // }
    
    @GetMapping
    public String getName() {
        return printer.print();
    }





    // @GetMapping("/add")
    // public int add() {
    //     return service.add();
    // }



}
