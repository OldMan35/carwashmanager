package ru.car.carwashmanager.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "admin_name")
    private String adminName;
    @Column(name = "password")
    private String password;
}
