package com.firstcompany.myfirstspringapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    //responsebody pouzij hello world jako body odpovedi
    //request rika spust metodu hello
    @ResponseBody
    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(@RequestParam int page, @RequestParam(required = false) String name) {
        return "hello" + name + "  Page: " + page;
    }

    //nyni rikame pouzij hello a najdi hello.html
    /*@RequestMapping(value = "/hello-from/html")
    public String helloFromHtml() {
        return "hello";
    }*/
}
