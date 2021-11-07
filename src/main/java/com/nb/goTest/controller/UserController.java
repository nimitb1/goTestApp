package com.nb.goTest.controller;

import com.nb.goTest.entity.User;
import com.nb.goTest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/save")
    public Mono<User> save(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/get/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public Mono<User> updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

}
