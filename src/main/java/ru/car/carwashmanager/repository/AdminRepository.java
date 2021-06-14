package ru.car.carwashmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.car.carwashmanager.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
