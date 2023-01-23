package com.example.profiles.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.profiles.Repository.orderRepository;
import com.example.profiles.Repository.productRepository;
import com.example.profiles.entity.Order;
import com.example.profiles.entity.Product;

@Component
public class TestOpeartions implements CommandLineRunner {
	@Autowired
	private orderRepository orepo;
	@Autowired
	private productRepository prepo;

	@Override
	public void run(String... args) throws Exception {
		
		Product p1 = new Product(1501, "PEN", 20.0);
		Product p2 = new Product(1502, "BTL", 40.0);
		Product p3 = new Product(1503, "BOX", 30.0);
		
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		
		Order ord = new Order(2301, "ONLINE", 5.0, Arrays.asList(p1,p2,p3));
		orepo.save(ord);

	}

}
