package com.example.DockerApp.data.repository;

import com.example.DockerApp.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserById(Integer id);
    void deleteUserById(Integer id);
}
