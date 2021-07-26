package ru.car.carwashmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })
public class CarwashmanagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(CarwashmanagerApplication.class, args);
    }

}
