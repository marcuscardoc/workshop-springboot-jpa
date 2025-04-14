package com.marcuscardosoteste.teste.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcuscardosoteste.teste.entities.Category;
import com.marcuscardosoteste.teste.entities.Order;
import com.marcuscardosoteste.teste.entities.Product;
import com.marcuscardosoteste.teste.entities.User;
import com.marcuscardosoteste.teste.entities.enums.OrderStatus;
import com.marcuscardosoteste.teste.repositories.CategoryRepository;
import com.marcuscardosoteste.teste.repositories.OrderRepository;
import com.marcuscardosoteste.teste.repositories.ProductRepository;
import com.marcuscardosoteste.teste.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Marcus", "Marcus@gmail.com", "92981081914", "12345");
		User u2 = new User(null, "Cardoso", "Cardoso@gmail.com", "92982649145", "54321");

		Order o1 = new Order(null, Instant.parse("2025-04-11T16:30:00Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o2 = new Order(null, Instant.parse("2023-12-25T08:00:00Z"), OrderStatus.CANCELED, u2);
		Order o3 = new Order(null, Instant.parse("2023-12-25T08:00:00Z"), OrderStatus.PAID, u1);

		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Books");
		Category c3 = new Category(null, "Computers");

		Product p1 = new Product(null, "The lord od the rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante", 2190.0, "");
		Product p3 = new Product(null, "Macbook pro", "Nam eleifend maximus tortor, at mollis", 1250.0, "");
		Product p4 = new Product(null, "Rails for dumnies", "Cras frangilla convallis sem vel faucibus", 100.99, "");

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
		
		p1.getCategories().add(c2);
		p2.getCategories().add(c1);
		p3.getCategories().add(c3);
		p4.getCategories().add(c2);
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
	}

}
