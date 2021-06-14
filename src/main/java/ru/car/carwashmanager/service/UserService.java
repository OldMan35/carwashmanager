package ru.car.carwashmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.car.carwashmanager.model.User;
import ru.car.carwashmanager.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public User saveUser(User user) {

        return userRepository.save(user);
    }

    public List<User> findAll() {

        return userRepository.findAll();
    }

    public void deleteById(long id) {
        userRepository.deleteById(id);
    }

    public User findById(long id) {
        return userRepository.getById(id);
    }
}
