package com.tomacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class HelloWebController {

    int font = 0;
    int counter = 0;
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    Random rn = new Random();

    @RequestMapping(value = "/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        counter++;
        //model.addAttribute("name", " World");
        model.addAttribute("userName", name);
        //model.addAttribute("webCounter", counter);
        //model.addAttribute("greetsSel", selectGreet(hellos));
        //model.addAttribute("color1", "blue");
        //model.addAttribute("fontSize1",15);
        model.addAttribute("color2","green");
        fbwMethod(model);
        return "greeting";
    }



    private String selectGreet(String[] hello) {
        return hello[rn.nextInt(hello.length - 1)];
    }

    private void fbwMethod(Model model){
        counter++;
        String textForNumber = "";
        int fontSize = 0;
        if(counter % 3 == 0){
            textForNumber = "fizz";
            fontSize = 24;
        }
        if(counter % 5 == 0){
            textForNumber = "buzz";
            fontSize = 48;
        }
        if(counter % 7 == 0){
            textForNumber = "woof";
            fontSize = 72;
        }
        if(textForNumber.length() > 0){
            model.addAttribute("fbwValues",textForNumber);
            model.addAttribute("fontSize2", fontSize);
        }else{
            model.addAttribute("fbwValues",counter);
            model.addAttribute("fontSize2",12);
        }

    }
}
