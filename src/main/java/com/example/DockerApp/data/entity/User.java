package com.example.DockerApp.data.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", columnDefinition = "TEXT")
    private String password;

}
