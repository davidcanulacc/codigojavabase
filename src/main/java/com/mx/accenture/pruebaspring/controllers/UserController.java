package com.mx.accenture.pruebaspring.controllers;

import com.mx.accenture.pruebaspring.entities.User;
import com.mx.accenture.pruebaspring.services.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceI userServiceI;

    @GetMapping("/api/hola/{valuador}")
    public User hola(@PathVariable String valuador){
        return userServiceI.hola(valuador);
    }
    @GetMapping("/api/guardadavid")
    public User guardavid(){
        return userServiceI.comoEstas();
    }
}
