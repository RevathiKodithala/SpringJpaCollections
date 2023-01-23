package com.example.profiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.Product;

public interface productRepository extends JpaRepository<Product,Integer> {

}
