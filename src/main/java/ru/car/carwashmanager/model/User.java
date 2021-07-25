package ru.car.carwashmanager.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(name = "jpaSequence", sequenceName = "JPA_SEQUENCE", allocationSize = 1, initialValue = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_surname")
    private String userSurname;

    @Column(name = "telephone_number")
    private String telephoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

}
