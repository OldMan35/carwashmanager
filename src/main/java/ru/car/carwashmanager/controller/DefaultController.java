package ru.car.carwashmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.car.carwashmanager.model.User;
import ru.car.carwashmanager.service.UserService;

import java.util.List;

@Controller
public class DefaultController {

    private UserService userService;

    @Autowired
    public DefaultController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/adminpage")
    public String adminpage(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "adminpage";
    }

    @GetMapping("/registration")
    public String userRegistrationForm(User user) {
        return "registration";
    }

    @PostMapping("/registration")
    public String saveUser(User user) {
        userService.saveUser(user);
        return "redirect:/userpage";
    }

    @GetMapping("/userupdate/{id}")
    public String updateUserForm(User user) {
        return "userupdate";
    }

    @PostMapping("/userupdate")
    public String updateUser(User user) {
        userService.saveUser(user);
        return "redirect:/adminpage";
    }

    @GetMapping("/usercreate")
    public String createUserForm(User user) {
        return "usercreate";
    }

    @PostMapping("/usercreate")
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/adminpage";
    }

    @GetMapping("/userdelete/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.deleteById(id);
        return "redirect:/adminpage";
    }

}
