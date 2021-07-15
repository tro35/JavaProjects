package com.tomacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

   //Greeting greet = new Greeting(1, "HelloWorld");


    /*@RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name){
        return new Greeting (1, "Hello " + name);
    }*/
    int count = 0;
    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name){
        count++;
        Greeting greet = new Greeting(count, "Hello " + name);
        return greet;
    }
}
