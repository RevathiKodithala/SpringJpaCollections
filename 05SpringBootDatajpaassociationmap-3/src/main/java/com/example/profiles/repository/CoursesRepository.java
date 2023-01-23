package com.example.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Integer> {

}
