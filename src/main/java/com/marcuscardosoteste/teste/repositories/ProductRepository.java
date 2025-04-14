package com.marcuscardosoteste.teste.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.marcuscardosoteste.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
