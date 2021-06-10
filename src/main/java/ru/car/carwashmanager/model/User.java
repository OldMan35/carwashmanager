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
    private String dateOfVisit;
    private String telephoneNumber;
    private String clientName;
    private String carBrand;
    private String serviceType;
    private int servicePrice;

}
