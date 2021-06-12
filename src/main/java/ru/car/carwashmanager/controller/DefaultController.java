package ru.car.carwashmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.car.carwashmanager.model.User;
import ru.car.carwashmanager.service.UserService;

@Controller
public class DefaultController {

    private UserService userService;

    @Autowired
    public DefaultController(UserService userService) {
        this.userService = userService;
    }

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
    public String userRegistrationForm(User user) {
        return "registration";
    }

    @PostMapping("/registration")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "userpage";
    }

}
