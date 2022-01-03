package com.example.DockerApp.business;

import com.example.DockerApp.data.entity.User;
import com.example.DockerApp.data.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }
    public void deleteUserById(Integer id) {
        userRepository.deleteUserById(id);
    }
}
