package com.gmail.gnoianko.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccauntController {

    @RequestMapping("/primaryAccaunt")
    public String primaryAccaunt(){
        return "primaryAccaunt";
    }

    @RequestMapping("/savingsAccaunt")
    public String savingsAccaunt(){
        return "savingsAccaunt";
    }

}
