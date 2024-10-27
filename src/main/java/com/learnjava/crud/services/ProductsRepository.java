package com.learnjava.crud.services;

import com.learnjava.crud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
