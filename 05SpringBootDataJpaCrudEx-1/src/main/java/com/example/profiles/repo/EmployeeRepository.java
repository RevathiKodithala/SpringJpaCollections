package com.example.profiles.repo;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.profiles.Entity.Employee;



public interface EmployeeRepository extends PagingAndSortingRepository <Employee, Integer> {

	Iterable<Employee> findAll();

	void saveAll(List<Employee> asList);

	

	

	

}
