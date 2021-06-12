package ru.car.carwashmanager.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "client_name")
    private String clientName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

}
