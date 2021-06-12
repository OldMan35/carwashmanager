package ru.car.carwashmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.car.carwashmanager.model.User;

public interface AdminRepository extends JpaRepository<User, Long> {
}
