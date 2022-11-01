package com.epam.brest.springsecuritywithdynamic.auth.repositories;

import com.epam.brest.springsecuritywithdynamic.auth.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}