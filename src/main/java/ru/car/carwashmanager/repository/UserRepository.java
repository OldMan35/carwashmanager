package ru.car.carwashmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.car.carwashmanager.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
