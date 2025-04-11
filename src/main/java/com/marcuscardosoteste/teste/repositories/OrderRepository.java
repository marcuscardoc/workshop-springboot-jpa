package com.marcuscardosoteste.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcuscardosoteste.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
