package com.rafaelrocha.course.repositories;

import com.rafaelrocha.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>  {
}
