package com.example.profiles.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.profiles.entity.Profile;
import com.example.profiles.entity.User;
import com.example.profiles.repository.ProfileRepository;
import com.example.profiles.repository.UserRepository;

@Component
public class TestOnetoOne implements CommandLineRunner{
	@Autowired
	private ProfileRepository prepo;
	@Autowired
    private UserRepository urepo;
	
	public void run(String... args) throws Exception {
		Profile p1 = new Profile(1650, "ACTIVE", "DEV-001");
		Profile p2 = new Profile(1651, "ACTIVE", "QA-002");
		
		prepo.save(p1);
		prepo.save(p2);
		
		User u1 = new User(4401, "AJAY", "MN091", p1);
		User u2 = new User(4402, "SYED", "ABCD", p2);
		
		urepo.save(u1);
		urepo.save(u2);
		
		
	}

}
