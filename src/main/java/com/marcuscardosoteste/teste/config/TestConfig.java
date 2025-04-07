package com.marcuscardosoteste.teste.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcuscardosoteste.teste.entities.User;
import com.marcuscardosoteste.teste.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
 
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Marcus", "Marcus@gmail.com", "92981081914", "12345");
		User u2 = new User(null, "Cardoso", "Cardoso@gmail.com", "92982649145", "54321");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
