package com.example.profiles.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.profiles.entity.Courses;
import com.example.profiles.entity.Student;
import com.example.profiles.repository.CoursesRepository;
import com.example.profiles.repository.StudentRepository;
@Component
public class TestOperations implements CommandLineRunner{
	@Autowired
	private StudentRepository srepo;
	
	@Autowired
	private CoursesRepository crepo;
	
	public void run(String... args) throws Exception {
		Courses c1 = new Courses(10, "Core Java", 2000.0);
		Courses c2 = new Courses(11, "SBMS", 4000.0);
		Courses c3 = new Courses(12, "UI TECH", 3000.0);
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		
		Student s1 = new Student(9001, "AJAY", "HYD", Arrays.asList(c1,c2));
		Student s2 = new Student(9002, "SAM", "BAN", Arrays.asList(c2,c3));
		Student s3 = new Student(9003, "SYED", "CHN", Arrays.asList(c1,c2,c3));
		
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);

}}
