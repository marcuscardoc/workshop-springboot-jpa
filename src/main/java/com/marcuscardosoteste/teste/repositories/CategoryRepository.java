package com.marcuscardosoteste.teste.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.marcuscardosoteste.teste.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
