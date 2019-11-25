package com.openinno.domain.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    @JsonSerialize
    private Long id;
    @Getter
    private String email;
    @Getter
    private String username;
    @Getter
    private String password;
    @Getter
    private String name;

    public User(Long id, String email, String username, String password, String name){
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public User(){}
}
