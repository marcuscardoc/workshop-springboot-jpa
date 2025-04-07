package com.marcuscardosoteste.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcuscardosoteste.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
