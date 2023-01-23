package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.repository.Employeerepository;

@Component
public class Runner {
	@Autowired
	private Employeerepository repo;

	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
	}

}
