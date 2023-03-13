package com.products.productsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.products.productsservice.models.Product;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
