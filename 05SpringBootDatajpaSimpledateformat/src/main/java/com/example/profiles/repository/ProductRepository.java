package com.example.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
