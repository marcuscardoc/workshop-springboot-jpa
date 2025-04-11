package com.marcuscardosoteste.teste.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcuscardosoteste.teste.entities.Order;
import com.marcuscardosoteste.teste.entities.User;
import com.marcuscardosoteste.teste.repositories.OrderRepository;
import com.marcuscardosoteste.teste.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
 
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Marcus", "Marcus@gmail.com", "92981081914", "12345");
		User u2 = new User(null, "Cardoso", "Cardoso@gmail.com", "92982649145", "54321");
		
		Order o1 = new Order(null, Instant.parse("2025-04-11T16:30:00Z") , u2);
		Order o2 = new Order(null, Instant.parse("2023-12-25T08:00:00Z") , u2);
		Order o3 = new Order(null, Instant.parse("2023-12-25T08:00:00Z") , u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
