package com.bankoftom.bank.controllers;

import com.bankoftom.bank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankController {
    BankAccount account = new BankAccount("Tom",2000.52,"director");

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String getAccount(Model model){
        model.addAttribute("accountOwner", account.getName());
        model.addAttribute("accountBalance", account.getBalance());
        model.addAttribute("accountType", account.getClientType());
        return "show";
    }
}
