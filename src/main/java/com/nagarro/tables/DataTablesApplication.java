package com.nagarro.tables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nagarro.tables.entity.User;
import com.nagarro.tables.repository.UserRepository;

@SpringBootApplication
public class DataTablesApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DataTablesApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		long count=userRepository.count();
		if(count==0) {
		User user=new User();
		user.setEmail("admin");
		user.setPassword("admin");
		userRepository.save(user);
		}
		
	}

}
