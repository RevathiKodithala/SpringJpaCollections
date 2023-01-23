package com.example.profiles.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.profiles.Entity.Product;
import com.example.profiles.repository.ProductRepository;


@Component
public class TestDateOperations implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	
	public void run(String... args) throws Exception {
		Product p1 = new Product (101, "PEN", new Date(), new Date(), new Date());
		 repo.save(p1);
		
	}

}
