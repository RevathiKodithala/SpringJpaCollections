package com.example.profiles.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profiles.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	

	

	

	List<Object[]> getproductnameVendornames();
	

}
