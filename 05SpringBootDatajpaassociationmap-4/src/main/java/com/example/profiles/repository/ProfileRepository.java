package com.example.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
