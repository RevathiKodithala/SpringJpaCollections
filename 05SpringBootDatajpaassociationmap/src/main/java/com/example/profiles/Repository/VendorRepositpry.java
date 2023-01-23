package com.example.profiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.Vendor;

public interface VendorRepositpry extends JpaRepository<Vendor, Integer> {

}
