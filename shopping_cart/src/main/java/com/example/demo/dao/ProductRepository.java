package com.example.demo.dao;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Devon Ravihansa on 8/29/2017.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findBySku(String sku);
}
