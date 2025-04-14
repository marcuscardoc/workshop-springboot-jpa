package com.marcuscardosoteste.teste.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.marcuscardosoteste.teste.entities.Category;
import com.marcuscardosoteste.teste.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
