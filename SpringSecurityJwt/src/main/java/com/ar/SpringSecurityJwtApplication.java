package com.ar;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ar.entities.User;
import com.ar.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtApplication {
	@Autowired
	private UserRepository repository;
	
	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User(101,"User1","123","user1@gmail.com"),
				new User(102,"User2","123","user2@gmail.com"),
				new User(103,"User3","123","user3@gmail.com"),
				new User(104,"User4","123","user4@gmail.com"),
				new User(105,"User5","123","user5@gmail.com")
				).collect(Collectors.toList());
		
		repository.saveAll(users);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

}
