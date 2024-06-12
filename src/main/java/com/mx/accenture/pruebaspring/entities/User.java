package com.mx.accenture.pruebaspring.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Generated;

import java.util.UUID;

@Entity
@Table(name = "user_system")
public class User {
    @Id
    @GeneratedValue
    public UUID id;

    public String userName;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
