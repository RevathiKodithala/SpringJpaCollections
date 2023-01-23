package com.example.profiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.Order;

public interface orderRepository extends JpaRepository<Order, Integer> {

}
