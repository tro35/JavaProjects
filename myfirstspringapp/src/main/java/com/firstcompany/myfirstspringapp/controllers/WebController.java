package com.firstcompany.myfirstspringapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping(value = "/hello-from/html")
    public String helloFromHtml() {
        return "hello";
    }

}
