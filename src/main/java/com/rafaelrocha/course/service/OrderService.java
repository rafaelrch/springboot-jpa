package com.rafaelrocha.course.service;

import com.rafaelrocha.course.entities.Order;

import com.rafaelrocha.course.repositories.OrderRepository;
import com.rafaelrocha.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();

    }

    public Order findyById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
