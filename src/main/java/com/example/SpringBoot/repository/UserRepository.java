package com.example.SpringBoot.repository;

import com.example.SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> findByLastName(String lastName);
}
