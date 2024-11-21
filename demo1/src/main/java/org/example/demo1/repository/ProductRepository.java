package com.example.demo1.repository;

import com.example.demo1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Przykładowa niestandardowa metoda
    Product findByName(String name);
}
