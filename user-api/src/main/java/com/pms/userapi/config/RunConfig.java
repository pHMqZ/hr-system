package com.pms.userapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pms.userapi.entity.User;
import com.pms.userapi.repository.UserRepository;

@Configuration
public class RunConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Alceu Marques", "alceu@mail.com", "1234", 45.0);
		User u2= new User(null, "Elis Marques", "elis@mail.com", "1234", 50.0);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	

}
