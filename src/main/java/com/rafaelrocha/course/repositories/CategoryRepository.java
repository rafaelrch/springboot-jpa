package com.rafaelrocha.course.repositories;

import com.rafaelrocha.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
}
