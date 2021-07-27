package ru.car.carwashmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.car.carwashmanager.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.userName = :userName")
    User getUserByUserName(@Param("userName") String userName);
}
