package com.example.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.Product;

public interface ProductRepository extends JpaRepository <Product,Integer>{

	

}
