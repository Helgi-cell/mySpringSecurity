package com.epam.brest.springsecuritywithdynamic.auth.repositories;

import com.epam.brest.springsecuritywithdynamic.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    default Optional <User> findUserByUsername(String username){
        return findAll().stream().filter(us -> us.getUsername().equals(username)).findFirst();
    }
}
