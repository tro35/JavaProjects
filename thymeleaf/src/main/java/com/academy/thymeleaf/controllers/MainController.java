package com.academy.thymeleaf.controllers;

import com.academy.thymeleaf.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class MainController {

    List<User> users = new ArrayList<>();

    public MainController() {
        users.add(new User("Tomas", 35, "male", "https://www.google.com"));
        users.add(new User("Jirka", 45, "male", "https://www.seznam.cz"));
        users.add(new User("Jana", 27, "female", "https://www.idnes.cz"));
        users.add(new User("Eva", 30, "female", "https://www.ihned.cz"));
    }

    //Vytvorime endpoint ktery pozdravi uzivatele pokud takovy existuje
    //pokud neexistuje vypise hlasku uzivatel neexistuje
    @RequestMapping(path="/{urlname}", method = RequestMethod.GET )
    public String showUserData(@PathVariable (name="urlname") String userName, Model model){
        Optional<User> userOption = users.stream().filter(u -> u.getName().equals(userName)).findFirst();
            if (userOption.isPresent()){
                User user = userOption.get();
                model.addAttribute("name", user.getName());
                model.addAttribute("gender", user.getGender());
                model.addAttribute("isUser", true);
            }else{
                model.addAttribute("isUser", false);
            }
        return "userdata";
    }

    //Enpoint vrati uzivatele s danym pohlavim
    @RequestMapping(path="/users", method = RequestMethod.GET )
    public String showUserWithGender(@RequestParam(required = false) String gender, Model model){
        List<User> usersToDisplay = new ArrayList<>();

        if(gender != null && !gender.isEmpty()){
            usersToDisplay = users.stream().filter(u -> u.getGender().equals(gender)).collect(Collectors.toList());
        }else{
            usersToDisplay = users;
        }
        model.addAttribute("users", usersToDisplay);
        return "users";
    }

    /*@PostMapping("/add")
    public String addUser(String username, Integer age, String gender, String page){
        users.add(new User(username,age,gender,page));
        return "redirect:/users";
    }*/

    @PostMapping("/add")
    public String addUser(@ModelAttribute User user){
        users.add(user);
        return "redirect:/users";
    }
}
