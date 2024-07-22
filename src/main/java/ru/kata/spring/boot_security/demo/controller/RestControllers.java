package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin
public class RestControllers {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public String saveNewUser(@RequestBody User user) {
        userService.saveUser(user);
        return "redirect:/admin";
    }

    @GetMapping("/get/")
    public User getUser(long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/delete")
    public String delete(long id) {
        userService.deleteUser(id);
        return "redirect:/admin";
    }
}