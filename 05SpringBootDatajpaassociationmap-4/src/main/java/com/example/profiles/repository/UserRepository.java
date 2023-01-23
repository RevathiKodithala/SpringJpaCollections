package com.example.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
