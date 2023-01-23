package com.example.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
