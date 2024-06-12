package com.mx.accenture.pruebaspring.repositories;

import com.mx.accenture.pruebaspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query("SELECT u  FROM User u where userName=:name")
    public User getUserByUserName(String name);

}
