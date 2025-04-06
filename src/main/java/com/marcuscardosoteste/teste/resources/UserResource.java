package com.marcuscardosoteste.teste.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcuscardosoteste.teste.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> retornarUsuarios() {
		User u = new User(1L, "Marcus", "marcus@gmail.com","92981081914","12345");
		return ResponseEntity.ok().body(u);
	}
	
	
}
