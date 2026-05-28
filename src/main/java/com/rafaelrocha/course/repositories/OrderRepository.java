package com.rafaelrocha.course.repositories;

import com.rafaelrocha.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>  {
}
