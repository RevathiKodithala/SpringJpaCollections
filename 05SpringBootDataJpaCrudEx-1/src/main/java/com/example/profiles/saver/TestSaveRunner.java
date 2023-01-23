package com.example.profiles.saver;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.profiles.Entity.Employee;
import com.example.profiles.repo.EmployeeRepository;

@Component
public class TestSaveRunner implements CommandLineRunner{
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		Iterable<Employee> list= repo.findAll();
		for (Employee pob : list) {
			System.out.println(pob);
		}
		//repo.saveAll(
				//List.of(
				/*Arrays.asList(
						new Employee(10, "AAB", 200.0, "DEV"),
						new Employee(11, "AAB", 200.0, "QA"),
						new Employee(12, "AAB", 200.0, "BA"),
						new Employee(13, "AAB", 300.0, "DEV"),
						new Employee(14, "AAB", 300.0, "QA"),
						new Employee(15, "AAB", 300.0, "BA"),
						new Employee(16, "AAB", 400.0, "DEV"),
						new Employee(17, "AAB", 400.0, "QA"),
						new Employee(18, "AAB", 400.0, "BA")
						)
				);*/
		
		
		
		
	}

	

}
