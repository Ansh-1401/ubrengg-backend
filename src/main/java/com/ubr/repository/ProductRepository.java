// src/main/java/com/ubr/repository/ProductRepository.java
package com.ubr.repository;

import com.ubr.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // No custom methods needed for basic pagination
}
