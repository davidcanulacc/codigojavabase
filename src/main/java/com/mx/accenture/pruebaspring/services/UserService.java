package com.mx.accenture.pruebaspring.services;

import com.mx.accenture.pruebaspring.entities.User;
import com.mx.accenture.pruebaspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService implements UserServiceI{

    @Autowired
    UserRepository userRepository;

    @Override
    public User hola(String valuador) {
        User user = userRepository.getUserByUserName("david");
        return user;
    }
    @Override
    public User comoEstas(){
        User user = new User();
        user.setUserName("david");
        User usuarioGuardado = userRepository.save(user);
        return usuarioGuardado;
    }
}
