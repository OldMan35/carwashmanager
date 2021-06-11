package ru.car.carwashmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DefaultController {

    @GetMapping("/homepage")
    public String homepage() {

        return "homepage";
    }

    //    @PostMapping("/homepage")
//    public String login() {
//
//        return "adminpage";
//        return "userpage";
//    }
    @GetMapping("/adminpage")
    public String adminpage() {

        return "adminpage";
    }

    @GetMapping("/registration")
    public String registration() {

        return "registration";
    }

}
